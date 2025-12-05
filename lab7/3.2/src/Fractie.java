public class Fractie implements Numeric{
    private int numarator;
    private int numitor;

    public Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }
    public Numeric add(Numeric x){
        int a = this.numitor * ((Fractie)x).numarator + this.numarator * ((Fractie)x).numitor;
        int b = this.numitor * ((Fractie)x).numitor;
        return new Fractie(a, b);
    }

    public Numeric sub(Numeric x){
        int a =  this.numarator * ((Fractie)x).numitor - ((Fractie)x).numarator * this.numitor;
        int b =  this.numarator * ((Fractie)x).numitor;
        return new Fractie(a, b);
    }

    public Numeric mul(Numeric x){
        int a =  this.numarator * ((Fractie)x).numarator;
        int b =  this.numitor * ((Fractie)x).numitor;
        return new Fractie(a, b);
    }
    public String toString(){
        return "Fractie: " + this.numarator + "/" + this.numitor;
    }
}
