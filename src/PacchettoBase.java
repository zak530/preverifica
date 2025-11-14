import java.util.Date;

public class PacchettoBase {
    private String descrizione;
    private Date andata;
    private Date ritorno;
    private float costobase = 50;


    public PacchettoBase(){
        this.descrizione=descrizione;
        this.andata=andata;
        this.ritorno = ritorno;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
