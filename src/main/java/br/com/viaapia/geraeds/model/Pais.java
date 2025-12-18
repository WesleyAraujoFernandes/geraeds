package br.com.viaapia.geraeds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAIS", schema = "dbo")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPais;
    private String strDescricao;
    private String strAbreviacao3;
    private String strAbreviacao2;
    private Integer intCodigoIso3166;
    private String strDescricaoIngles;
}
