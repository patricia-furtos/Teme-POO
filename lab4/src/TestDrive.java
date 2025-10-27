import java.awt.*;

public class TestDrive {
    static void main() {
        Autovehicul autovehicul = new Autovehicul("mercedes", Color.GRAY, 80, 4, 250, 6);
        autovehicul.accelerare(10);
        System.out.println(autovehicul.getViteza_crt());
        System.out.println(autovehicul.toString());

        autovehicul.sch_viteza(2);
        autovehicul.accelerare(40);
        System.out.println(autovehicul.toString());

        autovehicul.deaccelerare(20);
        System.out.println(autovehicul);

        Sofer sofer = new Sofer("Furtos","Patricia",20,1);
        autovehicul.setSofer(sofer);
        System.out.println(autovehicul.toString());
    }
}
