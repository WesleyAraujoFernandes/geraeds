package br.com.viaapia.geraeds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "titulo")
@Table(name = "titulo")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_titulo")
    private Integer idTitulo;
    @Column(name = "id_documentalista")
    private String documentalista;
    @Column(name = "id_responsavel_atualizacao")
    private String responsavelAtualizacao;
    @Column(name = "id_responsavel_inclusao")
    private String responsavelInclusao;
    @Column(name = "id_nivel_acesso")
    private String nivelAcesso;
    @Column(name = "id_periodicidade")
    private String periodicidade;
    @Column(name = "id_situacao")
    private String situacao;
    @Column(name = "id_pais")
    private String pais;
    @Column(name = "id_autor")
    private String autor;
    // Foreign keys above
    private String autorOutros;
    private Integer tituloPeriodico;
    @Column(name = "dat_data_atualizacao")
    private String dataPrimeiroUltimo;
    @Column(name = "str_numero_primeiro_ultimo")
    private String numeroPrimeiroUltimo;
    @Column(name = "str_pagina")
    private String pagina;
    @Column(name = "cutter")
    private String cutter;
    @Column(name = "str_capa")
    private String capa;
    // Foreign keys above
    private String editora;
    @Column(name = "id_idioma")
    private String idioma;
    @Column(name = "str_isbn")
    private String isbn;
    @Column(name = "str_issn")
    private String issn;
    // Verficar na base
    private String ano;
    @Column(name = "str_classificacao")
    private String classificacao;
    // Verficar na base
    private String local;
    private String notas;
    private String observacoes;
    private String paginas;
    private String responsabilidade;
    private String resumo;
    private String serie;
    private String areaEdicao;
    private String diferencial;
    private String outrosIdiomas;
    private String procedencia;
    private String tituloAlfabetado;
    private String tituloMonog;
    private String tipo;
    private String tipoDocumento;

}
