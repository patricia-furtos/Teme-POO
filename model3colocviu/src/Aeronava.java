public class Aeronava {
    private String marca;
    private String model;
    private static int total=0;
    public Aeronava(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }
    public Aeronava(){

    }
    public static void setTotal(int nou){
        total=nou;
    }
    public static int getTotal(){
        return total;
    }

    @Override
    public String toString(){
        return marca + " " + model;
    }
}
