package br.com.jpa.screenmatch.model;

import java.time.LocalDate;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer temporada, String titulo, Integer numeroEpisodio, Double avaliacao, LocalDate dataLancamento) {
        this.temporada = temporada;
        this.titulo = titulo;
        this.numeroEpisodio = numeroEpisodio;
        this.avaliacao = avaliacao;
        this.dataLancamento = dataLancamento;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString(){
        return "temporada=" + this.temporada +
                ", titulo='" + this.titulo + '\'' +
                ", numeroEpisodio=" + this.numeroEpisodio +
                ", avaliacao=" + this.avaliacao +
                ", dataLancamento=" + this.dataLancamento ;
    }
}
