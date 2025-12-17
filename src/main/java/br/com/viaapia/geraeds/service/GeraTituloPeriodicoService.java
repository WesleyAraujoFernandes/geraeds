package br.com.viaapia.geraeds.service;

import org.springframework.stereotype.Service;

@Service
public interface GeraTituloPeriodicoService {
    public Integer gerar(Integer idTitulo) throws Exception;
}
