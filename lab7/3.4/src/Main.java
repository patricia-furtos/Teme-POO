import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList <Persoana> pers = new  ArrayList <>();

        pers.add(new Persoana("Popescu", "Ion", 45));
        pers.add(new Persoana("Ionescu", "Maria", 23));
        pers.add(new Persoana("Georgescu", "Vasile", 30));
        pers.add(new Persoana("Anton", "Elena", 23));

        Collections.sort(pers);

        for(Persoana persoana : pers){
            System.out.println(persoana.toString());
        }

    }
}
