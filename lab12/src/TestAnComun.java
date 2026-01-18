import static org.junit.Assert.*;
import org.junit.*;
public class TestAnComun {
    private AnBisect anBisect;

    @Before
    public void setUp(){
        anBisect = new AnBisect();
        System.out.println("setUp");
    }

    @Test
    public void isAnBisectTest1() {
        assertFalse(anBisect.isAnBisect(203));
    }
    @Test
    public void isAnBisectTest2() {
        assertFalse(!anBisect.isAnBisect(4));
    }
    @Test
    public void isAnBisectTest3() {
        assertFalse(anBisect.isAnBisect(99));
    }
    @Test
    public void isAnBisectTest4() {
        assertFalse(anBisect.isAnBisect(100));
    }
    @Test
    public void isAnBisectTest5() {
        assertFalse(anBisect.isAnBisect(200));
    }
    @Test
    public void isAnBisectTest6() {
        assertFalse(!anBisect.isAnBisect(400));
    }
    @Test
    public void isAnBisectTest7() {
        assertFalse(anBisect.isAnBisect(500));
    }
    @Test
    public void isAnBisectTest8() {
        assertFalse(anBisect.isAnBisect(1000));
    }
    @Test
    public void isAnBisectTest9() {
        assertFalse(!anBisect.isAnBisect(1600));
    }
    @Test
    public void isAnBisectTest10() {
        assertFalse(anBisect.isAnBisect(2018));
    }

    @After
    public void tearDown(){
        anBisect = null;
        System.out.println("tearDown");
    }
}
