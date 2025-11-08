public class Animal {
    private int varsta;
    private String nume;
    private boolean flamand = true;
    private static int cnt;
    private int id;

    public Animal(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
        cnt++;
        this.id = cnt;
    }

    public Animal() {
        this.id = cnt;
        cnt++;
    }

    public void mananca(Mancare mancare) {
        flamand = false;
        System.out.println(mancare.toString());
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public boolean getFlamand() {
        return flamand;
    }

    public void activitate(){

    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nume: " + nume + " | Varsta: " + varsta + " | Flamand: " + flamand;
    }
}
