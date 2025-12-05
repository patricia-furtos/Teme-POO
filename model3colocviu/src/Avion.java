class Avion extends Aeronava{
    private int nr_locuri;

    public Avion(String marca, String model, int nr_locuri){
        super(marca,model);
        this.nr_locuri=nr_locuri;

    }
    public int getNr_locuri(){
        return nr_locuri;
    }


}
