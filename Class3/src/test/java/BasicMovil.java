import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicMovil {

    @Before
    public void before() {
        System.out.println("before");
    }
    @Test
    public void myFirstTest(){
        System.out.println("my first test...");
    }
    @Test
    public void mySecondTest(){
        System.out.println("my second test...");
    }
    @After
    public void after() {
        System.out.println("after");
    }
}
