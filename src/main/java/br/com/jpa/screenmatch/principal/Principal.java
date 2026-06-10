package br.com.jpa.screenmatch.principal;

import br.com.jpa.screenmatch.model.DadosSerie;
import br.com.jpa.screenmatch.model.DadosTemporada;
import br.com.jpa.screenmatch.service.ConsumoApi;
import br.com.jpa.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    Scanner scr = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados converteDados = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=e5b2055";

    public void run(){
        System.out.print("Digite o nome da série para busca:");
        var nomeBusca = scr.nextLine();
        var json = consumoApi.obterDados(ENDERECO + nomeBusca.replace(" ","+") + API_KEY);
        DadosSerie dadosSerie = converteDados.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i<= dadosSerie.totalTemporadas(); i++){
            json = consumoApi.obterDados(ENDERECO + nomeBusca.replace(" ","+")+ "&season="+ i + API_KEY);
            DadosTemporada dadosTemporada = converteDados.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }
}
