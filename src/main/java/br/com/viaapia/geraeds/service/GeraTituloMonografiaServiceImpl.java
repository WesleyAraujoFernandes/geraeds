package br.com.viaapia.geraeds.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.viaapia.geraeds.model.Titulo;
import br.com.viaapia.geraeds.repository.TituloRepository;

@Service
public class GeraTituloMonografiaServiceImpl implements GeraTituloMonografiaService {

    @Autowired
    private TituloRepository tituloRepository;
    private static final Logger logger = LoggerFactory.getLogger(GeraTituloMonografiaServiceImpl.class);

    @Override
    public Integer gerar(List<Integer> idTitulo) throws IllegalArgumentException {
        if (idTitulo == null) {
            throw new IllegalArgumentException("ID do título de monografia não pode ser nulo");
        }
        Integer qtdTitulos = 0;
        List<Titulo> titulos = tituloRepository.findAll();
        for (Titulo titulo : titulos) {
            logger.info("Processando título de monografia: {}", titulo.getTituloMonog());
            qtdTitulos++;
        }
        logger.info("Total de títulos de monografias gerados: {}", qtdTitulos);
        return qtdTitulos;
    }

    @Override
    public Integer gerar(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gerar'");
    }
}
