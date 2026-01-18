public class Serial extends ContinutMedia {
    private int nrSezoane;
    private boolean sezoaneViitor;

    public Serial(String titlu, String descriere, String regizor, String gen, int an,int nrSezoane,boolean sezoaneViitor) {
        super(titlu, descriere, regizor, gen, an);
        this.nrSezoane = nrSezoane;
        this.sezoaneViitor = sezoaneViitor;
    }

    public int  getNrSezoane() {
        return nrSezoane;
    }

    @Override
    public String toString() {
        return super.toString() + " nrSezoane " + nrSezoane + "sezoaneViitor " + sezoaneViitor;
    }
}
