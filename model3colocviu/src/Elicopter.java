class Elicopter extends Aeronava {
    private int autonomia;

    public Elicopter(String marca,String model,int autonomia) {
        super(marca,model);
        this.autonomia=autonomia;
    }
    public int getAutonomia() {
        return autonomia;
    }
}
