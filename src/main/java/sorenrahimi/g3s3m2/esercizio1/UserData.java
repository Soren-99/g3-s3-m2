package sorenrahimi.g3s3m2.esercizio1;

import lombok.ToString;
import lombok.AllArgsConstructor;
@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void setData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
