package br.com.viaapia.geraeds.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.geraeds.service.GeraTituloMonografiaService;

@RestController
@RequestMapping("gerar/monografias")
public class GeraTituloMonografiaController {
    private final GeraTituloMonografiaService geraTituloMonografiaService;

    public GeraTituloMonografiaController(GeraTituloMonografiaService geraTituloMonografiaService) {
        this.geraTituloMonografiaService = geraTituloMonografiaService;
    }

    @GetMapping("by-codigos")
    public Integer monografiasByCodigos(@RequestParam("codigos") List<Integer> codigos) throws Exception {
        if (codigos == null || codigos.size() == 0) {
            throw new Exception("É necessário pelo menos um código para ser gerado!");
        }
        return this.geraTituloMonografiaService.gerar(codigos);
    }
}
