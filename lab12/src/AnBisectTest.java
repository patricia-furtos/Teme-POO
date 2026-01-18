import static org.junit.Assert.*;
import org.junit.*;
public class AnBisectTest {
    private AnBisect anBisect;

    @Before
    public void setUp(){
        anBisect = new AnBisect();
        System.out.println("setUp");
    }

    @Test
    public void isAnBisectTest1() {
        assertTrue(!anBisect.isAnBisect(203));
    }
    @Test
    public void isAnBisectTest2() {
        assertTrue(anBisect.isAnBisect(4));
    }
    @Test
    public void isAnBisectTest3() {
        assertTrue(!anBisect.isAnBisect(99));
    }
    @Test
    public void isAnBisectTest4() {
        assertTrue(!anBisect.isAnBisect(100));
    }
    @Test
    public void isAnBisectTest5() {
        assertTrue(!anBisect.isAnBisect(200));
    }
    @Test
    public void isAnBisectTest6() {
        assertTrue(anBisect.isAnBisect(400));
    }
    @Test
    public void isAnBisectTest7() {
        assertTrue(!anBisect.isAnBisect(500));
    }
    @Test
    public void isAnBisectTest8() {
        assertTrue(!anBisect.isAnBisect(1000));
    }
    @Test
    public void isAnBisectTest9() {
        assertTrue(anBisect.isAnBisect(1600));
    }
    @Test
    public void isAnBisectTest10() {
        assertTrue(!anBisect.isAnBisect(2018));
    }

    @After
    public void tearDown(){
        anBisect = null;
        System.out.println("tearDown");
    }
}
