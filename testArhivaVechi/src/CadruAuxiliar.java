public class CadruAuxiliar extends Angajat{
    private String profesie;
    private String locatie;

    public CadruAuxiliar(String nume, int salariu, String profesie, String locatie) {
        super(nume, salariu);
        this.profesie = profesie;
        this.locatie = locatie;
    }

}
