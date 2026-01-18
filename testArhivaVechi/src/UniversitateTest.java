import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class UniversitateTest {
    private Universitate u;

    @Before
    public void setUp(){
        u = new Universitate("utcn",5);
        System.out.println("setUp");
    }

    @Test
    public void test1(){
        assertEquals(u.cheltuieli(),0);
    }

    @Test
    public void test2(){
        try {
            u.angajeaza(new CadruDidactic("Giosan", 8000, "prof", new ArrayList<>(Arrays.asList("PC", "POO"))));
        }catch(FaraPosturiException e){
            System.out.println(e.getMessage());
        }
        assertEquals(u.cheltuieli(),8000);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown");
    }
}
