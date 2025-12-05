public class Zi {
    private String nume;
    private boolean lucratoare;

    public Zi(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public boolean isLucratoare() {
        return lucratoare;
    }
    public void setLucratoare() {
        this.lucratoare = true;
    }
    public void setNeLucratoare() {
        this.lucratoare = false;
    }
}
