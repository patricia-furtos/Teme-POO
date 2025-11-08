import java.util.ArrayList;

public class Ferma {
    private int nr_animale;
    private int max_animale;
    private Animal[] animale;
    public Ferma(int max_animale) {
        if(max_animale < 0 || max_animale > 10)
            this.max_animale = 10;
        else this.max_animale = max_animale;
        animale = new Animal[max_animale];
    }

    public void adaugaAnimal(Animal animal) {
       if(nr_animale<max_animale) {
           animale[nr_animale]=animal;
           nr_animale++;
       }
       else System.out.println("Ferma e plina");
    }

    public void afisare(){
        for(Animal a:animale){
            System.out.println(a);
        }
    }

    public void elimina() {
        int index = 0;
        for (Animal a : animale) {
            boolean preaBatrana = (a instanceof Gaina && a.getVarsta() > 8) ||
                    (a instanceof Vaca && a.getVarsta() > 16) ||
                    (a instanceof Caine && a.getVarsta() > 10);
            if (!preaBatrana) {
                animale[index++] = a;
            }
        }
        nr_animale = index;
        for (int i = index; i < max_animale; i++) {
            animale[i] = null;
        }
    }
}
