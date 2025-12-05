import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("Volkswagen", Color.black);
        Student s1= new Student("Fürtös","Patricia",masina);
        Student s2=null;
        try {
            s2 = (Student) s1.clone();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        s2.masina.setCuloare(Color.pink);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}