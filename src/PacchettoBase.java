import java.util.Date;

public class PacchettoBase {
    private String descrizione;
    private Date andata;
    private Date ritorno;
    private float costobase = 50;
    private int npersone;


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

    @Override
    public String toString() {
        return "pacchetto base [ descrizione: "+ descrizione+" data di andata: "+andata+ " data di ritorno: "+ritorno+" costo"
    }
}
