public class Complex {
    private double real;
    private double imaginar;

    public Complex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public Complex aduna(Complex c) {
        return new Complex(this.real + c.real, this.imaginar + c.imaginar);
    }

    public Complex scade(Complex c) {
        return new Complex(this.real - c.real, this.imaginar - c.imaginar);
    }

    public Complex inmulteste(Complex c) {
        double realPart = this.real*c.real - this.imaginar*c.imaginar;
        double imaginarPart = this.real*c.imaginar + this.imaginar*c.real;
        return  new Complex(realPart, imaginarPart);
    }

    public Complex imparte(Complex c) {
        double numitor =c.real*c.real + c.imaginar*c.imaginar;
        double realPart = (this.real*c.real + this.imaginar*c.imaginar)/numitor;
        double imaginar = (this.imaginar*c.real - this.real*c.imaginar)/numitor;
        return new  Complex(realPart, imaginar);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginar=" + imaginar +
                '}';
    }
}
