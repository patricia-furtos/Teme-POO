class Gaina  extends Animal{
    private int oua;
    public Gaina(String nume,int varsta,int oua){
        super(varsta,nume);
        this.oua=oua;
    }

    @Override
    public void activitate(){
        if(getFlamand()==true)
            System.out.println("E flamand");
        else System.out.println("Oua pe zi: " + oua);
    }

}
