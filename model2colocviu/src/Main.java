import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Corp[] corpuri = new Corp[3];
        Punct p1=new Punct();
        Punct p2=new Punct();
        System.out.println(p1.distanta(p2));
        Cub c1=new Cub(Color.blue, p1,3);
        Sfera s1=new Sfera(Color.BLACK,p2,4);
        Sfera s2=new Sfera(Color.BLACK,p2,2);
        c1.acelasiVolum(s1);
        System.out.println(Corp.getCnt());
        corpuri[0]=c1;
        corpuri[1]=s1;
        corpuri[2]=s2;
        int k=0;
        for(Corp c:corpuri){
            if(c instanceof Sfera)k++;
        }
    System.out.println(k);

    }
}
