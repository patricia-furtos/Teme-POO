public abstract class Angajat {
    private String nume;
    private int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return nume + " " + salariu;
    }

    public int getSalariu() {
        return salariu;
    }
}
