import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universitate {
    private String nume;
    private int nrPosturi;
    private Map<String, Angajat> angajati;

    public Universitate(String nume, int nrPosturi) {
        this.nume = nume;
        this.nrPosturi = nrPosturi;
        this.angajati = new HashMap<>();
    }

    public void angajeaza(Angajat a) throws FaraPosturiException{
        if(angajati.size() >= nrPosturi)
            throw new FaraPosturiException("nu mai is locuri");
        angajati.put(a.getNume(),a);
    }

    public void afiseaza(){
        for(Angajat a : angajati.values()){
            System.out.println(a.toString());
        }
    }

    public int cheltuieli(){
        int total=0;
        for(Angajat a : angajati.values()){
            total += a.getSalariu();
        }
        return total;
    }

    public void plecare(String a) throws FaraPosturiException{
        if(!angajati.containsKey(a))
            throw new FaraPosturiException("nu exista angajatul");
        else angajati.remove(a);
    }

    public void profiCePredauMaterie(String materie){
        for(Angajat a : angajati.values())
            if(a instanceof CadruDidactic){
                List<String> materii=((CadruDidactic) a).getDiscipline();
                for(String m : materii){
                    if(m.equals(materie)) System.out.println(a.toString());
                }
            }
    }
}
