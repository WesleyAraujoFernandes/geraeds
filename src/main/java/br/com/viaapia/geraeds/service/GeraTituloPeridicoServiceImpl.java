package br.com.viaapia.geraeds.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.viaapia.geraeds.model.Titulo;
import br.com.viaapia.geraeds.repository.TituloRepository;

public class GeraTituloPeridicoServiceImpl implements GeraTituloPeriodicoService {

    @Autowired
    private TituloRepository tituloRepository;
    private static final Logger logger = LoggerFactory.getLogger(GeraTituloMonografiaServiceImpl.class);

    @Override
    public Integer gerar(List<Integer> idTitulo) {

        if (idTitulo == null || idTitulo.isEmpty()) {
            throw new IllegalArgumentException("Lista de códigos não pode ser vazia");
        }

        List<Titulo> titulos = tituloRepository.findByIdTituloIn(idTitulo);

        if (titulos.isEmpty()) {
            logger.warn("Nenhum título encontrado para os códigos {}", idTitulo);
        }

        int qtdTitulos = 0;
        for (Titulo titulo : titulos) {
            logger.info("Processando título de monografia: {}", titulo.getTituloMonog());
            qtdTitulos++;
        }

        logger.info("Total de títulos de monografias gerados: {}", qtdTitulos);
        return qtdTitulos;
    }

}
