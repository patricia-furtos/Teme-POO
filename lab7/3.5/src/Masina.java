import java.awt.*;

public class Masina implements Cloneable{
    private String marca;
    private Color culoare;

    public Masina(String marca, Color culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "culoare=" + culoare;
    }
}
