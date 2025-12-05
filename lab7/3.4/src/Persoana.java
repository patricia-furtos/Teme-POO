public class Persoana implements Comparable{
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    /*public int compareTo(Object o) {
        Persoana persoana = (Persoana) o;
        return this.getNume().compareTo(persoana.getNume());
    }*/

    @Override
    public int compareTo(Object o) {
        Persoana persoana = (Persoana) o;
        return this.varsta - persoana.varsta;
    }

    @Override
    public String toString() {
        return getNume() + " " + getPrenume() + " " + getVarsta();
    }
}
