public class PacchettoFamiliare extends PacchettoBase{

    private int nminori;
    private int prezzofamiliarefinale;

    public PacchettoFamiliare(){
        this.nminori=nminori;
    }

    public void setNminori(int nminori) {
        this.nminori = nminori;
    }

    public int getNminori() {
        return nminori;
    }


    public int prezzofamiliare() {

        for(int i = 0;i<getNpersone();i++){
            if(nminori==1){
                prezzofamiliarefinale= getNpersone()*costobase-25;
            } else {
                prezzofamiliarefinale= getNpersone()*costobase-(nminori*35);


            }
        }
        return prezzofamiliarefinale;

    }

    public String toString() {
        return "pacchetto Familiare [ descrizione: "+ getDescrizione()+" ,data di andata: "+getAndata()+ " ,data di ritorno: "+getRitorno()+" ,prezzo finale: "+ prezzofamiliare()+" ,numero di passeggeri: "+getNpersone()+" ,di cui minori: "+ nminori+"]";
    }
}
