import java.time.LocalDate;
import java.util.Calendar;

public class Main{

    public static void main(String[] args){

        PacchettoBase egitto = new PacchettoBase();
        egitto.setDescrizione("vogliamo andare in egitto");
        egitto.setNpersone(10);
        //LocalDate egitto = egitto.LocalDate(2025, 06, 23);
        System.out.println(egitto);



        PacchettoFamiliare italia = new PacchettoFamiliare();
        italia.setNpersone(10);
        italia.setNminori(3);
        italia.setDescrizione("vogliamo andare in italia");
        System.out.println(italia);





        System.out.println("finito");
    }

}