import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private Integer viteza_crt;
    private Integer treapta_viteza;
    private Integer viteza_maxima;
    private Integer nr_trepte;

    public static final String TIP_AUTOVEHICUL= "masina";
    private Sofer sofer;

    public Autovehicul(String marca, Color culoare, Integer viteza_crt, Integer treapta_viteza, Integer vitza_maxima, Integer nr_trepte) {
        this.marca = marca;
        this.culoare = culoare;
        this.viteza_crt = viteza_crt;
        this.treapta_viteza = treapta_viteza;
        this.viteza_maxima = vitza_maxima;
        this.nr_trepte = nr_trepte;
    }

    public void accelerare(int n) {
        viteza_crt += n;
        if (viteza_crt > viteza_maxima) {
            viteza_crt = viteza_maxima;
        }
    }
    public void deaccelerare(int n){
        viteza_crt -= n;
        if (viteza_crt < 0) {
            viteza_crt = 0;
        }
    }

    public void sch_viteza(int n){
        if (n >= 0 && n <= nr_trepte) {
            treapta_viteza = n;
        }
    }

    public void oprire(){
        viteza_crt=0;
        treapta_viteza = 0;
    }

    public Integer getViteza_crt() {
        return viteza_crt;
    }

    public String getMarca() {
        return marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public Integer getTreapta_viteza() {
        return treapta_viteza;
    }

    public Integer getViteza_maxima() {
        return viteza_maxima;
    }

    public Integer getNr_trepte() {
        return nr_trepte;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    @Override
    public String toString() {
        return "Autovehicul{" +
                "marca='" + marca + '\'' +
                ", culoare=" + culoare +
                ", viteza_crt=" + viteza_crt +
                ", treapta_viteza=" + treapta_viteza +
                ", viteza_maxima=" + viteza_maxima +
                ", nr_trepte=" + nr_trepte +
                ", sofer=" + sofer +
                '}';
    }
}

