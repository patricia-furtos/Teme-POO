import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max_animale= in.nextInt();
        Ferma ferma = new Ferma(max_animale);
        Animal vaca=new Vaca("Joiana",17,12,false);
        Animal caine=new Caine("Rex", 5, true);
        Animal gaina=new Gaina("Cocorica", 2, 3);
        ferma.adaugaAnimal(vaca);
        ferma.adaugaAnimal(caine);
        ferma.adaugaAnimal(gaina);
        ferma.afisare();
        Mancare mancare = new Mancare("fan","naturala",2);
        vaca.mananca(mancare);
        caine.mananca(mancare);
        caine.activitate();
        gaina.activitate();
        vaca.activitate();
        ferma.elimina();
        ferma.afisare();
    }
}
