public class Mancare {
    private String nume;
    private String origine;
    private int cantitate;

    public Mancare(String nume,String origine,int cantitate){
        this.nume=nume;
        this.origine=origine;
        this.cantitate=cantitate;
    }

    public String toString() {
        return "Mancare: " + nume + " " + origine + " " + cantitate;
    }
}
