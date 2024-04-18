package sorenrahimi.g3s3m2.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Libro extends ComponenteLibro {
    private String Titolo;
    private List<Sezione> capitoli;
    private double prezzo;
    private List<String> autori;
    @Override
    public int getNumeroPagine() {
        return this.capitoli.stream().mapToInt(Sezione::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Titolo libro: " + this.getTitolo());
        this.capitoli.forEach(Sezione::stampa);

    }
}
