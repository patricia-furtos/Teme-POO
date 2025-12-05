public class CalendarLucru {
    private Zi[] zile;

    public CalendarLucru() {
        this.zile = new Zi[7];
        zile[0] = new Zi("luni");
        zile[1] = new Zi("marti");
        zile[2] = new Zi("miercuri");
        zile[3] = new Zi("joi");
        zile[4] = new Zi("vineri");
        zile[5] = new Zi("sambata");
        zile[6] = new Zi("duminica");
        for(int i = 0; i < 5; i++){
            zile[i].setLucratoare();
        }
        zile[5].setNeLucratoare();
        zile[6].setNeLucratoare();
    }

    public Zi[] getZile() {
        return zile;
    }
}
