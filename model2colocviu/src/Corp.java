import java.awt.*;

public class Corp {
    private Color color;
    private static int cnt;
    public Corp(Color color){
        this.color=color;
        cnt++;
    }

    @Override
    public String toString(){
        return "Corp "+this.color;
    }

    public double volum(){
        return -1;
    }

    public static int getCnt(){
        return cnt;
    }
    public boolean acelasiVolum(Corp c1){
        System.out.println(" aci: " + volum() +" "+ c1.volum());
        if(volum()==c1.volum())
            return true;
        return false;
    }
}
