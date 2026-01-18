import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Universitate u= new Universitate("UTCN",5);

        try{
            u.angajeaza(new CadruDidactic("Popescu Ion",
                    4000,
                    "sef de lucrari",
                   new ArrayList<>(Arrays.asList("Psn","PL"))));
        }catch(FaraPosturiException e){
            System.out.println(e.getMessage());
        }

        try {
            u.angajeaza(new CadruDidactic("Ionescu Alex",
                    3000,
                    "Asistent",
                    new ArrayList<>(Arrays.asList("PL", "POO", "PC"))));
        } catch (FaraPosturiException e) {
            System.out.println(e.getMessage());
        }

        try {
            u.angajeaza(new CadruAuxiliar("Pop Dorel",
                    2000,
                    "Electrician",
                    "Baritiu"));
        } catch (FaraPosturiException e) {
            System.out.println(e.getMessage());
        }

        try {
            u.angajeaza(new CadruDidactic("Enescu Cristian",
                    8000,
                    "Profesor",
                    new ArrayList<>(Arrays.asList("PC", "CAN"))));
        } catch (FaraPosturiException e) {
            System.out.println(e.getMessage());
        }

        try {
            u.angajeaza(new CadruAuxiliar("Costea Vasile",
                    1800,
                    "Instalator",
                    "Daicoviciu"));
        } catch (FaraPosturiException e) {
            System.out.println(e.getMessage());
        }

        try {
            u.angajeaza(new CadruAuxiliar("Marinescu Marin",
                    3700,
                    "Contabil",
                    "Memorandumului"));
        } catch (FaraPosturiException e) {
            System.out.println(e.getMessage());
        }

        u.afiseaza();

        try {
            u.plecare("Costea Vasile");
            System.out.println("a plecatttt");
        }catch (FaraPosturiException e){
            System.out.println(e.getMessage());
        }

        try{
            u.plecare("Enescu Emil");
        }catch (FaraPosturiException e){
            System.out.println(e.getMessage());
        }

        u.afiseaza();

        System.out.println(u.cheltuieli());

        u.profiCePredauMaterie("PC");
    }
}
