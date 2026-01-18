import static org.junit.Assert.*;
import org.junit.*;
public class TotalAeronaveTest {
    Aeroport aeroport;
    @Before
    public void setUp() {
        aeroport= new Aeroport(5,5);
        System.out.println("setUp()");
    }

    @Test
    public void TotalAeronaveTest(){
        try{
            aeroport.aterizeaza(new Avion());
        }
        catch(NuSuntLocuri e){
            System.out.println(e.getMessage());
        }

        try{
            aeroport.aterizeaza(new Avion());
        }catch (NuSuntLocuri e){
            System.out.println(e.getMessage());
        }

        assertEquals(2,aeroport.getAeronaveParcate());
    }
    @After
    public void tearDown() {
        System.out.println("tearDown()");
    }
}
