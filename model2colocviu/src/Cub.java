import java.awt.*;

public class Cub extends Corp{
    private Punct punct;
    private int lungime;

    public Cub(Color color,Punct punct,int lungime){
        super(color);
        this.punct=punct;
        this.lungime=lungime;
    }

    @Override
    public double volum(){
        return lungime*lungime*lungime;
    }
    @Override
    public String toString()
    {
        return super.toString() + punct.toString() + " " +lungime;
    }
}
