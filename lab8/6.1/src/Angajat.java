public class Angajat {
    private String nume;
    private CalendarLucru calendar;
    public Angajat(String nume) {
        this.nume = nume;
        this.calendar = new CalendarLucru();
    }

    public void lucreaza (String zi) throws ExceptieZiNelucratoare{
        if(zi!="luni" && zi!="marti" && zi!="miercuri" && zi!="joi" && zi!="vineri" && zi!="sambata" && zi!="duminica")
            throw new ExceptieZiNelucratoare(zi+ " nu este o zi a saptamanii");
        for(int i=0;i<calendar.getZile().length;i++) {
            if(zi.equals(calendar.getZile()[i].getNume())) {
                if(calendar.getZile()[i].isLucratoare()==false) {
                    throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
                }
                else System.out.println("angajatul " + this.nume + " lucreaza " + zi);
            }
        }
    }

    public CalendarLucru getCalendar() {
        return calendar;
    }
}
