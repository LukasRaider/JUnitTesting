package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc calc;
    static final double DELTA = 0.00001;
    @BeforeEach
    void setUp() {
        calc = new Calc();
    }

    //Secteni
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
    @Test
    void sectiNuly(){
        assertEquals(0,calc.Secti(0,0));
    }
    @Test
    void prvniNula(){
        assertEquals(20,calc.Secti(0,20));
    }
    @Test
    void sectiNula2(){
        assertEquals(20,calc.Secti(20,0));
    }
    @Test
    void sectiDveStejnaCisla(){
        assertEquals(80,calc.Secti(40,40));
    }
    @Test
    void sectiStejneOdsebe(){
        assertEquals(0,calc.Secti(40,-40));
    }
    @Test
    void sectiStejneOdsebe2(){
        assertEquals(0,calc.Secti(-40,40));
    }

    //Nasobeni
    @Test
    void nasobDvaKladna() {
        assertEquals(50,calc.Nasob(10,5));
    }
    @Test
    void nasobDvaZaporna(){
        assertEquals(10,calc.Nasob(-2,-5));
    }
    @Test
    void nasobZaporneKladne(){
        assertEquals(-10,calc.Nasob(-2,5));
    }
    @Test
    void nasobKladneZaporne(){
        assertEquals(-10,calc.Nasob(2,-5));
    }
    @Test
    void nasobTisice(){
        assertEquals(9000000,calc.Nasob(1000,9000));
    }
    @Test
    void nasobNuly(){
        assertEquals(0,calc.Nasob(0,0));
    }
    @Test
    void nasobNula(){
        assertEquals(-0,calc.Nasob(0,20));}
    @Test
    void nasobNula2(){
        assertEquals(0,calc.Nasob(20,0));
    }
    @Test
    void nasobDveStejnaCisla(){
        assertEquals(1600,calc.Nasob(40,40));
    }
    @Test
    void nasobStejneOdsebe(){
        assertEquals(-1600,calc.Nasob(40,-40));
    }
    @Test
    void nasobStejneOdsebe2(){
        assertEquals(-1600,calc.Nasob(-40,40));
    }

    //Odecteni
    @Test
    void odectiDvaKladna() {
        assertEquals(5,calc.Odecti(10,5));
    }
    @Test
    void odectiDvaZaporna(){
        assertEquals(3,calc.Odecti(-2,-5));
    }
    @Test
    void odectiZaporneKladne(){
        assertEquals(-7,calc.Odecti(-2,5));
    }
    @Test
    void odectiKladneZaporne(){
        assertEquals(7,calc.Odecti(2,-5));
    }
    @Test
    void odectiMiliony(){
        assertEquals(-8000000,calc.Odecti(1000000,9000000));
    }
    @Test
    void odectiNuly(){
        assertEquals(0,calc.Odecti(0,0));
    }
    @Test
    void odectiNula(){
        assertEquals(-20,calc.Odecti(0,20));}
    @Test
    void odectiNula2(){
        assertEquals(20,calc.Odecti(20,0));
    }
    @Test
    void odectiDveStejnaCisla(){
        assertEquals(0,calc.Odecti(40,40));
    }
    @Test
    void odectiStejneOdsebe(){
        assertEquals(80,calc.Odecti(40,-40));
    }
    @Test
    void odectiStejneOdsebe2(){
        assertEquals(-80,calc.Odecti(-40,40));
    }

    //deleni

    @Test
    void sectiDveKladna() {
        assertEquals(15, calc.Secti(10, 5));
    }

    @Test
    void sectiDveZaporna() {
        int actual = calc.Secti(-2, -5);
        assertEquals(-7, actual);
    }

    @Test
    void sectiPrvniKladne() {
        assertEquals(10, calc.Secti(15, -5));
    }

    @Test
    void sectiDruheKladne() {
        assertEquals(10, calc.Secti(-5, 15));
    }

    @Test
    void sectiPrvniNula() {
        assertEquals(25, calc.Secti(0, 25));
    }

    @Test
    void sectiDruhaNula() {
        assertEquals(20, calc.Secti(20, 0));
    }

    @Test
    void sectiDveNuly() {
        assertEquals(0, calc.Secti(0, 0));
    }

    @Test
    void sectiDveStejnaCisla2() {
        assertEquals(80, calc.Secti(40, 40));
    }
    @Test
    public void subtractZaporne(){
        double actual = calc.Odecti(-3,-4);
        assertEquals(1, actual, DELTA);
    }
    @Test
    public void subtractKladne(){
        double actual = calc.Odecti(3,4);
        assertEquals(-1, actual, DELTA);
    }
    @Test
    public void subtractDesetinneKladne(){
        double actual = calc.Odecti(3.5,4.7);
        assertEquals(-1.2, actual, DELTA);
    }
    @Test
    public void subtractDesetinneZaporne(){
        double actual = calc.Odecti(-3.5,-4.7);
        assertEquals(1.2, actual, DELTA);
    }
    @Test
    public void subtractDesetinneJednoZaporne(){
        double actual = calc.Odecti(-3.5,4.7);
        assertEquals(-8.2, actual, DELTA);
    }
    @Test
    public void multiplyKladne(){
        double actual = calc.Nasob(3,4);
        assertEquals(12, actual, DELTA);
    }
    @Test
    public void multiplyZaporne(){
        double actual = calc.Nasob(-3,-4);
        assertEquals(12, actual, DELTA);
    }
    @Test
    public void multiplyJednoZaporne(){
        double actual = calc.Nasob(3,-4);
        assertEquals(-12, actual, DELTA);
    }
    @Test
    public void multiplyNulou(){
        double actual = calc.Nasob(3,0);
        assertEquals(0, actual, DELTA);
    }
    @Test
    public void delKladne(){
        double actual = calc.Del(10,5);
        assertEquals(2, actual, DELTA);
    }
    @Test
    public void divideZaporne(){
        double actual = calc.Del(-10,-5);
        assertEquals(2, actual, DELTA);
    }
    @Test
    public void divideJednoZaporne(){
        double actual = calc.Del(10,-5);
        assertEquals(-2, actual, DELTA);
    }

    @Test
    public void delDoubleNulou(){
        double actual = calc.Del(3,0);
        assertEquals(Double.POSITIVE_INFINITY, actual, DELTA);
    }
    @Test
    public void divideNuluDoubleNulou(){
        double actual = calc.Del(0,0);
        assertEquals(Double.NaN, actual, DELTA);
    }
    @Test
    public void addFromToPrvniVetsi(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    double actual = calc.SectiOdDo(3,2);
                });
    }
    @Test
    public void addFromToPrvniMensi(){
        double actual = calc.SectiOdDo(2,5);
        assertEquals(14, actual);
    }
    @Test
    public void addFromToPrvniZaporne(){
        double actual = calc.SectiOdDo(-2,5);
        assertEquals(12, actual);
    }
    @Test
    public void addFromToDruheZaporne(){
        assertThrows(IllegalArgumentException.class, () -> {
            double actual = calc.SectiOdDo(2,-5);
        });
    }
    @Test
    public void addFromToObeStejna(){
        double actual = calc.SectiOdDo(5,5);
        assertEquals(5, actual, DELTA);
    }




}