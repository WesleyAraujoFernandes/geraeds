package br.com.viaapia.geraeds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "titulo_eds")
@Table(name = "titulo_eds")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TituloEds {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer idTitulo;
    private String documentalista;
    private String responsavelAtualizacao;
    private String responsavelInclusao;
    private String nivelAcesso;
    private String periodicidade;
    private String situacao;
    private String pais;
    private String autor;
    private String autorOutros;
    private String tituloPeriodico;
    private Integer intTituloPeriodico;
    private String dataPrimeiroUltimo;
    private String numeroPrimeiroUltimo;
    private String pagina;
    private String cutter;
    private String capa;
    private String editora;
    private String idioma;
    private String isbn;
    private String issn;
    private String ano;
    private String classificacao;
    private String local;
    private String notas;
    private String observacoes;
    private String paginas;
    private String responsabilidade;
    private String resumo;
    private String serie;
    private String areaEdicao;
    private String autor1Monog;
    private String autor2Monog;
    private String autor3Monog;
    private String autoroutrosMonog;
    private String diferencial;
    private String outrosIdiomas;
    private String procedencia;
    private String tituloAlfabetado;
    private String tituloMonog;
    private String tipo;
    private String tipoDocumento;

}
