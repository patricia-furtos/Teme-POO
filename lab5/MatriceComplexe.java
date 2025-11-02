import java.util.Arrays;

public class MatriceComplexe {
    private Integer linii;
    private Integer coloane;
    private Complex[][] matrice;

    public Integer getLinii() {
        return linii;
    }

    public Integer getColoane() {
        return coloane;
    }

    public Complex[][] getMatrice() {
        return matrice;
    }

    public MatriceComplexe(Integer linii, Integer coloane, Complex[][] matrice) {
        this.linii = linii;
        this.coloane = coloane;
        this.matrice = new Complex[linii][coloane];
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                this.matrice[i][j] = matrice[i][j];
            }
        }
    }

    public MatriceComplexe Adunare(MatriceComplexe matrice) {
        MatriceComplexe rezultat = new MatriceComplexe(linii, coloane, matrice.matrice);
        for (int i = 0; i < matrice.linii; i++) {
            for (int j = 0; j < matrice.coloane; j++) {
              rezultat.matrice[i][j] = this.matrice[i][j].aduna(matrice.matrice[i][j]);
            }
        }
        return rezultat;
    }

    public MatriceComplexe InmultireScalar(Complex scalar) {
        MatriceComplexe rezultat = new  MatriceComplexe(linii, coloane, this.matrice);
        for (int i = 0; i < this.linii; i++) {
            for (int j = 0; j < this.coloane; j++) {
                rezultat.matrice[i][j]=this.matrice[i][j].inmulteste(scalar);
            }
        }
        return  rezultat;
    }

    public MatriceComplexe InmultireMatrice(MatriceComplexe matrice) {
        Complex[][] rezultat= new Complex[this.linii][matrice.coloane];
        for (int i = 0; i < this.linii; i++) {
            for (int j = 0; j < matrice.coloane; j++) {
                Complex s = new Complex(0,0);
               for(int k=0;k<this.coloane;k++) {
                   s = s.aduna(this.matrice[i][k].inmulteste((matrice.matrice[k][j])));
               }
                rezultat[i][j] = s;
            }
        }

        return new  MatriceComplexe(this.linii, matrice.coloane, rezultat);
    }

    @Override
    public String toString() {

        return "MatriceComplexe{" +
                "linii=" + linii +
                ", coloane=" + coloane +
                ", matrice=" + Arrays.deepToString(matrice) +
                '}';
    }
}
