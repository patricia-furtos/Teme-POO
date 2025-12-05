public class Main {
    public static void main(String[] args){
        Aeroport aeroport=new Aeroport("Cluj",3,5);
        Avion a1=new Avion("marca1","model1", 20);
        Avion a2=new Avion("marca2","model2", 10);
        Avion a3=new Avion("marca3","model3", 20);
        Elicopter e1=new Elicopter("marca1","model1", 100);
        Elicopter e2=new Elicopter("marca2","model2", 400);
        Elicopter e3=new Elicopter("marca3","model3", 300);
        Elicopter e4=new Elicopter("marca4","model4", 400);
        Elicopter e5=new Elicopter("marca5","model5", 500);
        aeroport.aterizare(a1);
        aeroport.aterizare(a2);
        aeroport.aterizare(a3);
        aeroport.aterizare(e1);
        aeroport.aterizare(e2);
        aeroport.aterizare(e3);
        aeroport.aterizare(e4);
        aeroport.aterizare(e5);
        aeroport.afisare();
        System.out.println(Aeronava.getTotal());
        aeroport.decolare(a1);
        aeroport.afisare();
        System.out.println("descr: ");
        aeroport.afisare_descr();
    }
}
