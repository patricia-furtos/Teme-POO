class Vaca extends Animal{
    private int nrLitri;
    private boolean clopot;

    public Vaca(String nume,int varsta,int nrLitri,boolean clopot){
        super(varsta,nume);
        this.nrLitri=nrLitri;
        this.clopot=clopot;
    }
    public int getNrLitri() {
        return nrLitri;
    }
    public boolean getClopot() {
        return clopot;
    }

    @Override
    public void activitate(){
        if(getFlamand()==true)
            System.out.println("E flamand");
        else System.out.println("lapte pe zi" + nrLitri);
    }
}
