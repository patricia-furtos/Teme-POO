public class Matrice {
    private Numeric[][] A;
    private int n;
    private int m;
    public Matrice(int n, int m){
        this.n = n;
        this.m = m;
        this.A = new Numeric[n][m];
    }

    public void setElem(int i,int j,Numeric x){
        this.A[i][j]=x;
    }

    public Numeric getElem(int i,int j){
        return this.A[i][j];
    }

    public Matrice add (Matrice matr){
        Matrice rezultat =  new Matrice(matr.n, matr.m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               Numeric suma = this.getElem(i,j).add(matr.getElem(i,j));
                rezultat.setElem(i,j,suma);
            }
        }
        return rezultat;
    }

    public Matrice sub(Matrice matr){
        Matrice rezultat =  new Matrice(matr.n, matr.m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Numeric dif =this.getElem(i,j).sub(matr.getElem(i,j));
                rezultat.setElem(i,j,dif);
            }
        }
        return rezultat;
    }

    public Matrice mul(Matrice matr){
        Matrice rezultat =  new Matrice(matr.n, matr.m);
        for(int i=0;i<this.n;i++){
            for(int j=0;j<matr.m;j++){
                Numeric aux = this.getElem(i,0).mul(matr.getElem(0,j));
                for(int k=0;k<n;k++){
                    aux = aux.add(this.getElem(i,k).mul(matr.getElem(k,j)));
                }
                rezultat.setElem(i,j,aux);
            }
        }
        return rezultat;
    }

    public Matrice inmultireScalar(Numeric x){
        Matrice rezultat =  new Matrice(n, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rezultat.setElem(i,j,getElem(i,j).mul(x));
            }
        }
        return rezultat;
    }

    public void afiseazaMatrice(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(this.A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
