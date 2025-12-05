public class Aeroport {
    private String nume;
    private int max_avioane;
    private int max_elicoptere;
    private Avion[] avioane;
    private Elicopter[] elicoptere;
    private static int i=0,j=0;
    public Aeroport(String nume, int max_avioane, int max_elicoptere) {
        this.nume = nume;
        this.max_avioane = max_avioane;
        this.max_elicoptere = max_elicoptere;
        avioane=new Avion[max_avioane];
        elicoptere=new Elicopter[max_elicoptere];
    }

    public void aterizare(Aeronava a){
        if(a instanceof Avion && i<max_avioane){
            avioane[i++]=(Avion)a;
            Aeronava.setTotal(Aeronava.getTotal()+1);
        }
        if(a instanceof  Elicopter && j<max_elicoptere){
            elicoptere[j++]=(Elicopter)a;
            Aeronava.setTotal(Aeronava.getTotal()+1);
        }
    }

    public void decolare(Aeronava a){
        int index=0;
       if(a instanceof Avion){
           for(Avion av:avioane){
               if(!av.equals(a))avioane[index++]=av;
           }
           for(int j=index;j<avioane.length;j++){
               avioane[j]=null;
           }
       }
       else {
           for(Elicopter el:elicoptere){
               if(!el.equals(a))elicoptere[index++]=el;
           }
           for(i=index;i<avioane.length;i++){
               avioane[i]=null;
           }
       }
    }

    public void afisare(){
        for(Avion a:avioane){
            System.out.println(a);
        }
        for(Elicopter e:elicoptere){
            System.out.println(e);
        }
    }

    public void afisare_descr(){
        for(int k=0;k<elicoptere.length;k++){
            for(int l=k+1;l<elicoptere.length;l++){
                if(elicoptere[k].getAutonomia()<elicoptere[l].getAutonomia())
                {
                    Elicopter e=elicoptere[l];
                    elicoptere[l]=elicoptere[k];
                    elicoptere[k]=e;
                }
            }
        }
        for(Elicopter e:elicoptere){
            System.out.println(e);
        }
    }

    public Avion max_locuri(){
        int max=0;
        Avion av_max=null;
        for(Avion a:avioane){
            if(a.getNr_locuri()>max){
                max=a.getNr_locuri();
                av_max=a;
            }
        }
        return av_max;
    }

}
