public class Main {
    public static void main(String[] args) {

        Platforma platforma=new Platforma();

        try{
            platforma.adaugaContinut(new Film("titanic","da","nustiu", "romantic",2000,200));
        }catch(AnGresit e){
            System.out.println(e.getMessage());
        }

        try{
            platforma.adaugaContinut(new Serial("breaking bad","asa","da","actiune",2000,6,true));
        }catch(AnGresit e){
            System.out.println(e.getMessage());
        }

        try{
            platforma.adaugaContinut(new Film("taxi Driver", "Drama", "Martin Scorsese", "Drama", 1976, 114));
        }catch(AnGresit e){
            System.out.println(e.getMessage());
        }

        platforma.afisare();

        System.out.println(platforma.filmeScorsese());
        System.out.println(platforma.maxSezoane());
        System.out.println(platforma.regizorFilmLung());
    }
}
