package br.com.viaapia.geraeds.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface GeraTituloPeriodicoService {
    public Integer gerar(List<Integer> idTitulo) throws Exception;
}
