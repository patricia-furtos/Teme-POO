class Caine extends Animal{
    private boolean curajos;

    public Caine(String nume,int varsta,boolean curajos){
       super(varsta,nume);
       this.curajos=curajos;

    }
    public void setCurajos(boolean curajos) {
        this.curajos = curajos;
    }
    public boolean getCurajos() {
        return curajos;
    }

    @Override
    public void activitate(){
        if(getFlamand()==true)
            System.out.println("E flamand");
        else System.out.println("apara casa");
    }

}
