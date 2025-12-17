package br.com.viaapia.geraeds.service;

import org.springframework.stereotype.Service;

@Service
public interface GeraTituloMaterialService {
    public Integer gerar(Integer idTitulo) throws Exception;
}
