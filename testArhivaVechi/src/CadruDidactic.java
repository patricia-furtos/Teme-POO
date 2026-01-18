import java.util.ArrayList;
import java.util.List;

public class CadruDidactic extends Angajat{
    private String titluStiintific;
    private List<String> discipline;

    public CadruDidactic(String nume, int salariu, String titluStiintific,ArrayList<String> discipline) {
        super(nume, salariu);
        this.titluStiintific = titluStiintific;
        this.discipline = discipline;
    }

    public List<String> getDiscipline() {
        return discipline;
    }


}
