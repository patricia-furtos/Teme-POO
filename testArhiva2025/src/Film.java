public class Film extends ContinutMedia{
    private int durata;

    public Film(String titlu, String descriere, String regizor, String gen, int an, int durata){
        super(titlu, descriere, regizor, gen, an);
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return super.toString() + " durata: " + durata;
    }
}
