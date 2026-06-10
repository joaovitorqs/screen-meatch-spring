package br.com.jpa.screenmatch;

import br.com.jpa.screenmatch.model.DadosSerie;
import br.com.jpa.screenmatch.principal.Principal;
import br.com.jpa.screenmatch.service.ConsumoApi;
import br.com.jpa.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.run();
    }
}
