package br.com.viaapia.geraeds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAIS", schema = "dbo")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Idioma {
    private Integer idIdioma;
    private String strDescricao;
    private String strAbreviacao3;
    private String strAbreviacao2;
}
