package br.com.viaapia.geraeds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.viaapia.geraeds.model.TituloEds;
import br.com.viaapia.geraeds.repository.TituloEdsRepository;

@Service
public class GeraTituloMonografiaServiceImpl implements GeraTituloMonografiaService {

    @Autowired
    private TituloEdsRepository tituloEdsRepository;

    @Override
    public Integer gerar(List<Integer> idTitulo) throws IllegalArgumentException {
        if (idTitulo == null) {
            throw new IllegalArgumentException("ID do título de monografia não pode ser nulo");
        }
        Integer qtdTitulos = 0;
        List<TituloEds> titulosEds = tituloEdsRepository.findAll();
        for (TituloEds tituloEds : titulosEds) {
            qtdTitulos++;
        }
        System.out.println("Quantidade de registros de monografias: " + qtdTitulos);
        return qtdTitulos;
    }

    @Override
    public Integer gerar(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gerar'");
    }
}
