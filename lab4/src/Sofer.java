public class Sofer {
    private String nume;
    private String prenume;
    private Integer varsta;
    private Integer nrPermis;

    public Sofer(String nume, String prenume, Integer varsta, Integer nrPermis) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrPermis = nrPermis;
    }

    @Override
    public String toString() {
        return "Sofer{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", nrPermis=" + nrPermis +
                '}';
    }
}
