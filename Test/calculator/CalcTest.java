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
    void delDvaKladna() {
        assertEquals(2,calc.Del(10,5));
    }
    @Test
    void delDvaZaporna(){
        assertEquals(-1,calc.Del(-2,-5));
    }
    @Test
    void delZaporneKladne(){
        assertEquals(-1,calc.Del(-2,5));
    }
    @Test
    void delKladneZaporne(){
        assertEquals(-1,calc.Del(2,-5));
    }
    @Test
    void delMiliony(){
        assertEquals(-1,calc.Del(1000000,9000000));
    }
    @Test
    void delNuly(){
        assertEquals(-1,calc.Del(0,0));
    }
    @Test
    void delNula(){
        assertEquals(0,calc.Del(0,20));}
    @Test
    void delNula2(){
        assertEquals(-1,calc.Del(20,0));
    }
    @Test
    void delDveStejnaCisla(){
        assertEquals(0,calc.Del(40,40));
    }
    @Test
    void delStejneOdsebe(){
        assertEquals(-1,calc.Del(40,-40));
    }
    @Test
    void delStejneOdsebe2(){
        assertEquals(-1,calc.Del(-40,40));
    }

    //Secti od do

    @Test
    void OdDoDvaKladna() {
        assertEquals(-1,calc.SectiOdDo(10,5));
    }
    @Test
    void OdDoDvaZaporna(){
        assertEquals(-1,calc.SectiOdDo(-2,-5));
    }
    @Test
    void OdDoZaporneKladne(){
        assertEquals(2,calc.SectiOdDo(-2,5));
    }
    @Test
    void OdDoKladneZaporne(){
        assertEquals(-1,calc.SectiOdDo(2,-5));
    }
    @Test
    void OdDoTisice(){
        assertEquals(8000,calc.SectiOdDo(1000,9000));
    }
    @Test
    void OdDoNuly(){
        assertEquals(0,calc.SectiOdDo(0,0));
    }
    @Test
    void OdDoNula(){
        assertEquals(20,calc.SectiOdDo(0,20));}
    @Test
    void OdDoNula2(){
        assertEquals(-1,calc.SectiOdDo(20,0));
    }
    @Test
    void OdDoDveStejnaCisla(){
        assertEquals(0,calc.SectiOdDo(40,40));
    }
    @Test
    void OdDoStejneOdsebe(){
        assertEquals(-1,calc.SectiOdDo(40,-40));
    }
    @Test
    void OdDoStejneOdsebe2(){
        assertEquals(80,calc.SectiOdDo(-40,40));
    }

    // testovani pole

    @Test
    public void testPoleJePrazdne() {
        int[] prazdnePole = {};
        assertEquals("Pole je prázdné", calc.Pole(prazdnePole));
    }

    @Test
    public void testVsechnyPrvkyJsouCelaCisla() {
        int[] celeCisla = {1, 2, 3, 4, 5};
        assertEquals("Všechny prvky jsou celá čísla", calc.Pole(celeCisla));
    }

    @Test
    public void testNekteryPrvekNeniCeleCislo() {
        int[] neceleCislo = {1, 2, 3, 4, 5, 2.5}; // 2.5 není celé číslo
        assertEquals("Některý prvek není celé číslo", calc.Pole(neceleCislo));
    }

}