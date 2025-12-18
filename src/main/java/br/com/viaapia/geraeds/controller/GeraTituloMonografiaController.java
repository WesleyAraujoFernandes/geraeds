package br.com.viaapia.geraeds.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.geraeds.service.GeraTituloMonografiaService;

@RestController
@RequestMapping("gerar/monografias")
public class GeraTituloMonografiaController {
    private final GeraTituloMonografiaService geraTituloMonografiaService;
    private static final Logger logger = LoggerFactory.getLogger(GeraTituloMonografiaController.class);

    public GeraTituloMonografiaController(GeraTituloMonografiaService geraTituloMonografiaService) {
        this.geraTituloMonografiaService = geraTituloMonografiaService;
    }

    @GetMapping("by-codigos")
    public Integer monografiasByCodigos(@RequestParam("codigos") List<Integer> codigos) throws Exception {
        if (codigos == null || codigos.size() == 0) {
            throw new Exception("É necessário pelo menos um código para ser gerado!");
        }
        if (codigos != null && !codigos.isEmpty()) {
            logger.info("Iniciando geração de títulos de monografias para os códigos: {}", codigos);
        }
        this.geraTituloMonografiaService.gerar(codigos);
        logger.info("Geração de títulos de monografias completa.");
        return codigos.size();
    }
}
