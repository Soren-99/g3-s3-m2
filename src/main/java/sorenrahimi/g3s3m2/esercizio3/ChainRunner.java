package sorenrahimi.g3s3m2.esercizio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("--CHAIN--");
        Generale generale = new Generale();
        Colonello colonello = new Colonello();
        Tenente tenente = new Tenente();
        Maggiore maggiore = new Maggiore();
        Capitano capitano = new Capitano();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonello);
        colonello.setSuperiore(generale);
        capitano.doCheck(1200);

    }
}
