abstract class Aeronava {
    private String marca;
    private String model;
    public Aeronava(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }
    public Aeronava(){
    }
    public String getMarca(){
        return marca;
    };
    public String getModel(){
        return model;
    };
    public String toString(){
        return marca + " " + model;
    }
}
