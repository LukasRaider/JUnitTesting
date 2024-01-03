package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc calc;
    @BeforeEach
    void setUp() {
        calc = new Calc();
    }

    @Test
    void sectiDvaKladna() {
        assertEquals(15,calc.Secti(10,5));
    }
    @Test
    void sectiDvaZaporna(){
        assertEquals(-7,calc.Secti(-2,-5));
    }
    @Test
    void sectiZaporneKladne(){
        assertEquals(3,calc.Secti(-2,5));
    }
    @Test
    void sectiKladneZaporne(){
        assertEquals(-3,calc.Secti(2,-5));
    }
    @Test
    void sectiMiliony(){
        assertEquals(10000000,calc.Secti(1000000,9000000));
    }
}