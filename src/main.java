    public class main {
        public static void main(String[] args) {
            Complex complex = new Complex(1,2);
            Complex rezultat = complex.aduna(complex);
            System.out.println(rezultat.toString());

            Complex[][] valori1 = {
                    { new Complex(1, 0), new Complex(3, 0) },
                    { new Complex(5, 0), new Complex(7, 0) }
            };

            Complex[][] valori2 = {
                    { new Complex(2, 0), new Complex(0, 0) },
                    { new Complex(4, 0), new Complex(0, 0) }
            };

            Complex[][] valori3 = {
                    { new Complex(0, 0), new Complex(0, 0) },
                    { new Complex(0, 0), new Complex(0, 0) }
            };
            MatriceComplexe m1 = new MatriceComplexe(2, 2, valori1);
            MatriceComplexe m2 = new MatriceComplexe(2, 2, valori2);

            MatriceComplexe suma = m1.Adunare(m2);

            System.out.println("Matricea 1:\n" + m1.toString());
            System.out.println("Matricea 2:\n" + m2.toString());
            System.out.println("Suma matricilor:\n" + suma.toString());

            Complex scalar = new Complex(2, 0);
            MatriceComplexe M3 = suma.InmultireScalar(scalar);
            System.out.println("Matricea 3:\n" + M3.toString());

            MatriceComplexe produs = m1.InmultireMatrice(m2);
            System.out.println(produs.toString());

        }
    }