public class Main {
    public static void main(String[] args) {
        Aeroport aeroport = new Aeroport(3,2);
        Aeronava a1 = new Avion("firmaDeAvioane1","modelAvion1",200);
        Aeronava a2= new Avion("firmaDeAvioane2","modelAvion2",150);
        Aeronava e1 = new Elicopter("firmaDeElictopere1","modelElicopter1",10.0);
        Aeronava e2 = new Elicopter("firmaDeElicopteree","model",20.0);

        try{
        aeroport.aterizeaza(a1);
        }catch(NuSuntLocuri e){
            System.out.println(e.getMessage());
        }

        try{
            aeroport.aterizeaza(a2);
        } catch (NuSuntLocuri e){
            System.out.println(e.getMessage());
        }

        try {
            aeroport.aterizeaza(e1);
        }
        catch (NuSuntLocuri e){
            System.out.println(e.getMessage());
        }

        try{
            aeroport.aterizeaza(e2);
        }
        catch (NuSuntLocuri e){
            System.out.println(e.getMessage());
        }

        aeroport.locuriMaxim();

        aeroport.detaliiElicoptere();

    }
}
