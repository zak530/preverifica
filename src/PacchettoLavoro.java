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




}
