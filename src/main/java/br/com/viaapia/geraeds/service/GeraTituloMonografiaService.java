package br.com.viaapia.geraeds.service;

import java.util.List;

public interface GeraTituloMonografiaService {
    public Integer gerar(List<Integer> idTitulo) throws Exception;

    public Integer gerar(Integer id);
}
