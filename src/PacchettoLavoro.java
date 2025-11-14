public class PacchettoLavoro extends PacchettoBase{

    private int npasti;
    private int prezzolavoratorefinale;
    private int percentuale;

    public int getNpasti() {
        return npasti;
    }

    public void setNpasti(int npasti) {
        this.npasti = npasti;
    }



    public int prezzolavoratore() {

        for(int i = 0;i<npasti;i++){

            percentuale+=15;


            prezzolavoratorefinale= (costobase*percentuale)/100


        }
        return prezzolavoratorefinale;

    }

    public String toString() {
        return "pacchetto lavoratore [ descrizione: "+ getDescrizione()+" ,data di andata: "+getAndata()+ " ,data di ritorno: "+getRitorno()+" ,prezzo finale: "+ prezzolavoratore()+ " percentuale di sconto: "+percentuale+"  ,di cui pasti: "+ npasti+"]";
    }


}
