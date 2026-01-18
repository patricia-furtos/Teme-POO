import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Platforma {
    private List<ContinutMedia> continutMedia;
    public Platforma(){
        continutMedia = new ArrayList<ContinutMedia>();
    }
    public void adaugaContinut(ContinutMedia continut) throws AnGresit{
        if(continut.getAn()>2025)
            throw new AnGresit("an prea mare");
        else continutMedia.add(continut);
    }

    public int filmeScorsese(){
        int nrFilme=0;
        for(ContinutMedia continut: continutMedia){
            if(continut instanceof Film && continut.getRegizor().equals("Martin Scorsese") && continut.getAn()<2000)
                nrFilme++;
        }
        return nrFilme;
    }

    public String regizorFilmLung(){
        String numeRegizor="";
        int max=0;
        for(ContinutMedia continut: continutMedia){
            if(continut instanceof Film && ((Film) continut).getDurata()>max){
                max=((Film) continut).getDurata();
                numeRegizor=continut.getRegizor();
            }
        }
        return numeRegizor;
    }

    public Serial maxSezoane(){
        Serial maxim=null;
        int max=0;
        for(ContinutMedia continut: continutMedia){
            if(continut instanceof Serial && ((Serial) continut).getNrSezoane()>max){
                maxim=(Serial) continut;
                max=((Serial) continut).getNrSezoane();
            }
        }
        return maxim;
    }

    public void afisare(){
        Collections.sort(continutMedia);
        for(ContinutMedia continut: continutMedia){
            System.out.println(continut.toString());
        }
    }
}
