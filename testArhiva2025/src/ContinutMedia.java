public abstract class ContinutMedia implements Comparable{
    private String titlu;
    private String descriere;
    private String regizor;
    private String gen;
    private int an;

    public ContinutMedia(String titlu, String descriere, String regizor, String gen, int an) {
        this.titlu = titlu;
        this.descriere = descriere;
        this.regizor = regizor;
        this.gen = gen;
        this.an = an;
    }

    public int getAn() {
        return an;
    }

    public String getRegizor() {
        return regizor;
    }

    @Override
    public String toString() {
        return "titlu: " + titlu + " descriere " + descriere + " regizor: " + regizor + " gen: " + gen + " an: " + an;
    }

    @Override
    public int compareTo(Object o) {
        ContinutMedia c = (ContinutMedia) o;
        return c.titlu.compareTo(titlu);
    }
}
