package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Start debuging...");

            //
            // create table
            //
            //MoviesCreateTable dyna = new MoviesCreateTable();
            //dyna.criar_tabela();            

            //
            // read
            //
            MoviesLoadData dyna = new MoviesLoadData();
            dyna.ler_dados();            

        	
            System.out.println("...end debuging.");

        };
    }

}
