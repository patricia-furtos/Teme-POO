public class Student implements Cloneable {
    private String nume;
    private String prenume;
    Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    @Override
    public String toString() {
        return  "Student: nume=" + nume + ", prenume=" + prenume +  ", masina=" + masina.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        //daca comentam randu urmator, avem shallow copy, altfel deep copy
        clone.masina = (Masina) masina.clone();
        return clone;
    }
}
