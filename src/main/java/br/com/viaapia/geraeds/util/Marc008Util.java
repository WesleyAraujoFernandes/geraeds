package br.com.viaapia.geraeds.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import br.com.viaapia.geraeds.model.Titulo;
import br.com.viaapia.geraeds.model.TituloEds;

/* Classe utilitária para construção do campo 008 do registro MARC21 */
@Component
public class Marc008Util {
    private static final DateTimeFormatter YYMMDD = DateTimeFormatter.ofPattern("yyMMdd");

    public String build008(Titulo titulo) {
        StringBuilder sb = new StringBuilder(40);
        /* 00–05: Data de entrada no arquivo (YYMMDD) */
        sb.append(LocalDate.now().format(YYMMDD));
        /* 06: Tipo de data */
        sb.append(resolveDateType(titulo));
        /* 07–10: Data 1 (ano) */
        sb.append(resolveYear(titulo));
        /* 11–14: Data 2 (preenchimento) */
        sb.append("    ");
        /* 15–17: Lugar de publicação */
        sb.append(resolveCountry(titulo));
        /* 18–34: Elementos variados (preenchimento padrão) */
        sb.append("||||| |||| ||||| ");
        /* 35–37: Idioma */
        sb.append(resolveLanguage(titulo));
        /* 38: Registro modificado */
        sb.append("d");
        /* 39: Fonte da catalogação */
        sb.append("d");
        return padOrTrim(sb.toString(), 40);
    }

    private static String resolveDateType(Titulo titulo) {
        if (titulo.getAno() != null && titulo.getAno().length() == 4) {
            return "s"; // data única conhecida
        }
        return "u"; // desconhecida
    }

    private static String resolveYear(Titulo titulo) {
        if (titulo.getAno() != null && titulo.getAno().matches("\\d{4}")) {
            return titulo.getAno();
        }
        return "uuuu";
    }

    private static String resolveCountry(Titulo titulo) {
        // BRASIL segundo MARC21
        if ("Brasil".equalsIgnoreCase(titulo.getPais().getStrAbreviacao2())) {
            return "bl ";
        }
        return "xx ";
    }

    private static String resolveLanguage(Titulo titulo) {
        if (titulo.getIdioma() == null) {
            return "und";
        }

        return switch (titulo.getIdioma().getStrDescricao().toLowerCase()) {
            case "português", "portugues" -> "por";
            case "inglês", "ingles" -> "eng";
            case "espanhol" -> "spa";
            case "francês", "frances" -> "fre";
            default -> "und";
        };
    }

    private static String padOrTrim(String value, int length) {
        if (value.length() > length) {
            return value.substring(0, length);
        }
        return String.format("%-" + length + "s", value);
    }
}
