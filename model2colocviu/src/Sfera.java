import java.awt.*;

public class Sfera extends Corp{
    private Punct centru;
    private int raza;

    public Sfera(Color color, Punct centru, int raza){
        super(color);
        this.centru=centru;
        this.raza=raza;
    }

    @Override
    public double volum(){
        return 4*Math.PI*raza*raza*raza/3;
    }
}
