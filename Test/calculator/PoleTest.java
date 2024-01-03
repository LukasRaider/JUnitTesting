package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoleTest {
    public Pole pole;
    @BeforeEach
    void setUp() {
        pole = new Pole();
    }

    private static final double DELTA = 0.00001;


    @Test
    public void getMinInTheMiddle() {
        double[] input={21.0,3.1,-3.15,128.0,48.0};
        double actual = pole.getMin(input);
        assertEquals(-3.15, actual,DELTA);
    }
    @Test
    public void getMinFirst() {
        double[] input={-50,1000,21.0,3.1,128.0,48.0};
        double actual = pole.getMin(input);
        assertEquals(-50, actual,DELTA);
    }
    @Test
    public void getMinLast() {
        double[] input={21.0,3.1,128.0,48.0,200, -3.15};
        double actual = pole.getMin(input);
        assertEquals(-3.15, actual,DELTA);
    }
    @Test
    public void getMinAllTheSame() {
        double[] input={100,100,100,100};
        double actual = pole.getMin(input);
        assertEquals(100.0, actual,DELTA);
    }
    @Test
    public void getMinOneNumber() {
        double[] input={100};
        double actual = pole.getMin(input);
        assertEquals(100, actual,DELTA);
    }
    @Test
    public void getMinAllNegative() {
        double[] input={-10,-5,-6,-7,-8};
        double actual = pole.getMin(input);
        assertEquals(-10, actual,DELTA);
    }
    @Test
    public void getMinEmptyArray() {
        double[] input={};
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> {
            double actual = pole.getMin(input);
        });
    }
    @Test
    public void getMinNull() {
        double[] input=null;
        assertThrows(NullPointerException.class, ()-> {
            double actual = pole.getMin(input);
        });
    }


}