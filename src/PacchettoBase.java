import java.time.LocalDate;
import java.util.Date;

public class PacchettoBase {
    private String descrizione;
    private LocalDate andata;
    private LocalDate ritorno;
    protected int costobase = 50;
    private int npersone;
    private int prezzofinale;


    public PacchettoBase(){
        this.descrizione=descrizione;
        this.andata=andata;
        this.ritorno = ritorno;
    }


    public LocalDate getAndata() {
        return andata;
    }

    public LocalDate getRitorno() {
        return ritorno;
    }

    public void setAndata(LocalDate andata) {
        this.andata = andata;
    }


    public void setRitorno(LocalDate ritorno) {
        this.ritorno = ritorno;
    }



    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getNpersone() {
        return npersone;
    }

    public void setNpersone(int npersone) {
        this.npersone = npersone;
    }

    LocalDate data = LocalDate.of(2022, 11, 23);


    //metodo che calcola il costo complessivo
    public int prezzofinale(){
        prezzofinale = 50*npersone;
        return prezzofinale;
    }



    @Override
    public String toString() {
        return "pacchetto base [ descrizione: "+ descrizione+" ,data di andata: "+andata+ " ,data di ritorno: "+ritorno+" ,prezzo finale: "+ prezzofinale()+" ,numero di passeggeri: "+npersone+"]";
    }




}
