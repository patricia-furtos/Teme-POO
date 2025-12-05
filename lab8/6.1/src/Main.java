public class Main {
    public static void main(String[] args) {
        Angajat a1 = new Angajat("Gigel");
        //a1.getCalendar().getZile()[1].setNeLucratoare();
        try {
            a1.lucreaza("luni");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            a1.lucreaza("marte");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            a1.lucreaza("duminica");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
