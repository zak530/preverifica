import java.time.LocalDate;
import java.util.Calendar;

public class Main{

    public static void main(String[] args){

        PacchettoBase egitto = new PacchettoBase();
        egitto.setDescrizione("vogliamo andare in egitto");
        egitto.setNpersone(10);

        egitto.setAndata(2_000,3,3);

        System.out.println(egitto);



        PacchettoFamiliare italia = new PacchettoFamiliare();
        italia.setNpersone(10);
        italia.setNminori(3);
        italia.setDescrizione("vogliamo andare in italia");
        System.out.println(italia);



        PacchettoLavoro olanda = new PacchettoLavoro();
        olanda.setNpasti(2);
        olanda.setDescrizione("vado in olanda per lavoro");
        System.out.println(olanda);





        System.out.println("finito");
    }

}