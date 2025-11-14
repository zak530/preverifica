public class PacchettoLavoro extends PacchettoBase{

    private int npasti;
    private int prezzolavoratorefinale;

    public int getNpasti() {
        return npasti;
    }

    public void setNpasti(int npasti) {
        this.npasti = npasti;
    }



    public int prezzolavoratore() {

        for(int i = 0;i<getNpersone();i++){
            if(npasti==1){
                prezzolavoratorefinale= getNpersone()*costobase-25;
            } else {
                prezzolavoratorefinale= getNpersone()*costobase-(nminori*35);


            }
        }
        return prezzolavoratorefinale;

    }


}
