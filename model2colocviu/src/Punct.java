import java.util.Scanner;

public class Punct {
    private int x;
    private int y;
    private int z;
    private static final int dim =10;

    public Punct(){
        Scanner in = new Scanner(System.in);
        this.x=in.nextInt();
        while(this.x>Punct.getDim() || this.x<-Punct.getDim()){
            this.x=in.nextInt();
        }
        this.y=in.nextInt();
        while(this.y>Punct.getDim() || this.y<-Punct.getDim()){
            this.y=in.nextInt();
        }
         this.z=in.nextInt();
        while(this.z>Punct.getDim() || this.z<-Punct.getDim()){
            this.z=in.nextInt();
        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public double distanta(Punct p){
        double x1=(p.getX()-x);
        double y1=(p.getY()-y);
        double z1=(p.getZ()-z);
        return Math.sqrt(x1*x1+y1*y1+z1*z1);
    }

    public static int getDim(){
        return dim;
    }
    @Override
    public String toString(){
        return "punct: " + x +" "+y+" "+z;
    }
}
