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

@Entity
@Table(name = "TITULO", schema = "dbo")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_titulo")
    private Integer idTitulo;
    @Column(name = "id_documentalista")
    private Integer documentalista;
    @Column(name = "id_responsavel_atualizacao")
    private Integer responsavelAtualizacao;
    @Column(name = "id_responsavel_inclusao")
    private Integer responsavelInclusao;
    @Column(name = "id_nivel_acesso")
    private Integer nivelAcesso;
    @Column(name = "id_periodicidade")
    private Integer periodicidade;
    @Column(name = "id_situacao_periodico")
    private Integer situacao_periodico;
    @Column(name = "id_pais")
    private Pais pais;
    @Column(name = "id_autor")
    private Integer autor;
    @Column(name = "str_titulo")
    private String titulo;
    /*
     * @Column(name = "str_titulo_complementar")
     * private String subtitulo;
     */
    @Column(name = "str_titulo_original")
    private String tituloOriginal;
    /*
     * @Column(name = "str_volume")
     * private String volume;
     */
    /*
     * @Column(name = "str_edicao")
     * private String edicao;
     */
    /*
     * @Column(name = "dat_ano_publicacao")
     * private String anoPublicacao;
     */
    // Foreign keys above
    // private String autorOutros;
    /*
     * @Column(name = "int_titulo_periodico")
     * private Integer tituloPeriodico;
     */
    @Column(name = "str_titulo_complementar")
    private String tituloComplementar;
    @Column(name = "str_data_primeiro_ultimo")
    private String dataPrimeiroUltimo;
    @Column(name = "str_numero_primeiro_ultimo")
    private String numeroPrimeiroUltimo;
    @Column(name = "str_pagina")
    private String pagina;
    @Column(name = "str_cutter_lombada")
    private String cutter;
    @Column(name = "str_capa")
    private String capa;
    // Foreign keys above
    // private String editora;
    @Column(name = "id_idioma")
    private Integer idioma;
    /*
     * @Column(name = "str_isbn")
     * private String isbn;
     */
    @Column(name = "str_issn")
    private String issn;
    // Verficar na base
    // private String ano;
    @Column(name = "str_classificacao")
    private String classificacao;
    // Verficar na base
    /*
     * private String local;
     */
    @Column(name = "txt_notas")
    private String notas;
    @Column(name = "txt_observacao")
    private String observacao;
    @Column(name = "str_responsabilidade")
    private String responsabilidade;
    @Column(name = "txt_resumo")
    private String resumo;
    @Column(name = "str_serie")
    private String serie;
    @Column(name = "str_area_edicao")
    private String areaEdicao;
    @Column(name = "str_diferencial")
    private String diferencial;
    // Foreign keys above
    /*
     * private String outrosIdiomas;
     */
    // Verficar na base
    /*
     * private String procedencia;
     */
    @Column(name = "str_titulo_alfabetado")
    private String tituloAlfabetado;
    /*
     * @Column(name = "str_titulo_monog")
     * private String tituloMonog;
     */
    @Column(name = "int_titulo_periodico")
    private short tituloPeriodico; /* 1 = título periódico, 2 = material especial, 3 = título monográfico */
    @Column(name = "id_dgm")
    private Integer tipoDocumento;

}
