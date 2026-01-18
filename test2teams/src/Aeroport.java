import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aeroport {
    private int maxAvioane;
    private int maxElicoptere;
    private List<Aeronava> aeronave;
    public Aeroport(int maxAvioane, int maxElicoptere) {
        this.maxAvioane = maxAvioane;
        this.maxElicoptere = maxElicoptere;
        this.aeronave = new ArrayList<>();
    }

    public void aterizeaza(Aeronava aeronava) throws NuSuntLocuri{
        boolean ok = false;
        if(aeronava instanceof Avion){
            int nrAvioane=0;
            for(Aeronava a : aeronave)
                if(a instanceof Avion)nrAvioane++;
            if(nrAvioane<maxAvioane)ok=true;
        }
        else if(aeronava instanceof Elicopter){
            int nrElicoptere=0;
            for(Aeronava a : aeronave)
                if(a instanceof Elicopter)nrElicoptere++;
            if(nrElicoptere<maxElicoptere)ok=true;
        }

        if(ok)
        {
           this.aeronave.add(aeronava);
           System.out.println(aeronava.getMarca() + " a aterizat");
       }
       else{
           throw new NuSuntLocuri("nu mai is locuri pe aeroport");
       }
    }

    public void decolare(Aeronava aeronava) throws NuSuntLocuri{
        if(!aeronave.contains(aeronava)){
            throw new NuSuntLocuri("aeronava "+ aeronava.getMarca() + " nu este in aeroport");
        }
        else{
            this.aeronave.remove(aeronava);
            System.out.println(aeronava.getMarca() + " a decolat");
        }
    }

    public int  getAeronaveParcate() {
        return this.aeronave.size();
    }

    public void locuriMaxim(){
        int max = 0;
        Avion avionMax = new Avion();
        if(this.aeronave.size() == 0){
            System.out.println("aeroport gol");
            return;
        }
        for(Aeronava aeronava : aeronave){
           if(aeronava.getClass().equals(Avion.class)){
               if(((Avion)aeronava).getNrLocuri()>max){
                   max = ((Avion)aeronava).getNrLocuri();
                    avionMax=(Avion) aeronava;
               }
           }
        }
        System.out.println(avionMax.toString());
    }


    public void detaliiElicoptere(){
        List<Elicopter> elicoptere = new ArrayList<>();
        for(Aeronava aeronava : aeronave){
            if(aeronava.getClass().equals(Elicopter.class)) {
                elicoptere.add((Elicopter) aeronava);
            }
        }
        Collections.sort(elicoptere);
        for(Elicopter elicopter : elicoptere){
            System.out.println(elicopter.toString());
        }
    }
}
