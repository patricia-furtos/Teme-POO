public class Complex implements Numeric {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() { return real; }
    public double getImag() { return imag; }

    @Override
    public Numeric add(Numeric x) {
        Complex c = (Complex) x;
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    @Override
    public Numeric sub(Numeric x) {
        Complex c = (Complex) x;
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    @Override
    public Numeric mul(Numeric x) {
        Complex c = (Complex) x;
        double newReal = (this.real * c.real) - (this.imag * c.imag);
        double newImag = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(newReal, newImag);
    }

    @Override
    public String toString() {
        return "(" + this.real + ", " + this.imag + ")";
    }
}