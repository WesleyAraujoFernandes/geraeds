package br.com.viaapia.geraeds.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.geraeds.model.enums.TipoBibliografico;
import br.com.viaapia.geraeds.service.GeraTituloMonografiaService;

@RestController
@RequestMapping("/")
public class EdsController {

    private final GeraTituloMonografiaService geraTituloMonografiaService;

    public EdsController(GeraTituloMonografiaService geraTituloMonografiaService) {
        this.geraTituloMonografiaService = geraTituloMonografiaService;
    }

    @PostMapping("gerar/{tipo}")
    public Integer gerar(@RequestParam("id") Integer id,
            @RequestParam("tipoBibliografico") TipoBibliografico tipoBibliografico) throws Exception {
        try {
            if (tipoBibliografico.equals(TipoBibliografico.MONOGRAFIA))
                return geraTituloMonografiaService.gerar(id);
        } catch (Exception e) {
            throw new Exception("Erro ao gerar o arquivo de exportação para o EDS");
        }
        return 0;
    }
}
