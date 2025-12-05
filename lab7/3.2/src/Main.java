public class Main {
    public static void main(String[] args) {
        Matrice m1= new Matrice(2,2);
        Matrice m2= new Matrice(2,2);
        m1.setElem(0, 0, new Complex(1, 2)); // 1 + 2i
        m1.setElem(0, 1, new Complex(3, 0)); // 3
        m1.setElem(1, 0, new Complex(0, 4)); // 4i
        m1.setElem(1, 1, new Complex(2, -1)); // 2 - i

        m2.setElem(0, 0, new Complex(2, 1));
        m2.setElem(0, 1, new Complex(1, 1));
        m2.setElem(1, 0, new Complex(1, 0));
        m2.setElem(1, 1, new Complex(0, 1));

        m1.afiseazaMatrice();
        System.out.println();
        m2.afiseazaMatrice();

        Matrice suma = m1.add(m2);
        Matrice produs = m1.mul(m2);

        System.out.println();
        suma.afiseazaMatrice();
        System.out.println();
        produs.afiseazaMatrice();

        Matrice f1 = new Matrice(2, 2);
        f1.setElem(0, 0, new Fractie(1, 2)); // 1/2
        f1.setElem(0, 1, new Fractie(1, 3)); // 1/3
        f1.setElem(1, 0, new Fractie(1, 4)); // 1/4
        f1.setElem(1, 1, new Fractie(1, 5)); // 1/5

        Matrice f2 = new Matrice(2, 2);
        f2.setElem(0, 0, new Fractie(1, 2));
        f2.setElem(0, 1, new Fractie(2, 3));
        f2.setElem(1, 0, new Fractie(3, 4));
        f2.setElem(1, 1, new Fractie(4, 5));

        Matrice sumaF= f1.add(f2);
        Matrice produsF= f1.mul(f2);
        System.out.println();
        sumaF.afiseazaMatrice();
        System.out.println();
        produsF.afiseazaMatrice();
    }
}
