package sorenrahimi.g3s3m2.esercizio2;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("--COMPOSITE--");
        Faker faker = new Faker(Locale.ITALY);
        Page pag1 = new Page(1, faker.harryPotter().quote());
        Page pag2 = new Page(2, faker.harryPotter().quote());
        Page pag3 = new Page(3, faker.harryPotter().quote());
        Page pag4 = new Page(4, faker.harryPotter().quote());
        Page pag5 = new Page(5, faker.harryPotter().quote());
        Page pag6 = new Page(6, faker.harryPotter().quote());

        Sezione sottocapitolo1 = new Sezione("Sottocapitolo 1", Arrays.asList(pag1, pag2));
        Sezione sottocapitolo2 = new Sezione("Sottocapitolo 2", Arrays.asList(pag3, pag4));
        Sezione sottocapitolo3 = new Sezione("Sottocapitolo 3", Arrays.asList(pag5, pag6));

        Sezione capitolo1 = new Sezione("Capitolo1", Arrays.asList(sottocapitolo1, sottocapitolo2));
        Sezione capitolo2 = new Sezione("Capitolo2", Arrays.asList(sottocapitolo3));

        Libro libro = new Libro(faker.harryPotter().book(),
                Arrays.asList(capitolo1, capitolo2), 18.0,
                Arrays.asList(faker.harryPotter().character(),
                        faker.harryPotter().character(),
                        faker.harryPotter().character()));
        libro.stampa();
        System.out.println("Il libro " + libro.getTitolo() + " ha " +
                libro.getNumeroPagine() + " pagine");

    }
}
