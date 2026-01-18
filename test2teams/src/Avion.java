public class Avion extends Aeronava{
    private int nrLocuri;
    public Avion(String marca, String model, int nrLocuri) {
        super(marca, model);
        this.nrLocuri = nrLocuri;
    }
    public Avion(){
        super();
        this.nrLocuri=0;
    }
    public int getNrLocuri() {
        return nrLocuri;
    }
    @Override
    public String toString() {
        String s = super.toString();
        return  s + "nrLocuri=" + nrLocuri;
    }
}
