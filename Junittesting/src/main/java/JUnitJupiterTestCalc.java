import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class JUnitJupiterTestCalc {
    private final Calculate cal = new Calculate();


    @Test
    void subtraction1(){
        assertEquals(0.0, calc.sub(1.0,1.0));
    }
    @Test
    void addition1(){
        assertEquals(2.0, calc.add(1.0,1.0));
    }
    @Test
    void division1(){
        assertEquals(2.0, calc.div(10.0,5.0));
    }
    @Test
    void addition1(){
        assertEquals(24.0, calc.mult(8.0,3.0));
    }
}
