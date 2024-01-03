package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoleDovnitrPoleVenTest {
    PoleDovnitrPoleVen poleDovnitrPoleVen;

    @BeforeEach
    void setUp() {
        poleDovnitrPoleVen = new PoleDovnitrPoleVen();
    }

    @Test
    public void ackaNaZacatku() {
        String[] input = {"asd", "asc", "sdf", "ert"};
        String[] actual = poleDovnitrPoleVen.vratSubPole(input);
        assertArrayEquals(new String[]{"asd", "asc", null, null}, actual);
    }
    @Test
    public void ackaUprostred() {
        String[] input = {"fff", "egt", "asd", "aeg","asc", "sdf", "ert" };
        String[] actual = poleDovnitrPoleVen.vratSubPole(input);
        assertArrayEquals(new String[]{"asd", "aeg","asc", null, null, null, null}, actual);
    }
    @Test
    public void ackaNaKonci() {
        String[] input = {"fff", "egt", "sdf", "ert", "asd", "aeg", "asc"};
        String[] actual = poleDovnitrPoleVen.vratSubPole(input);
        assertArrayEquals(new String[]{"asd", "aeg","asc", null, null, null, null}, actual);
    }
    @Test
    public void samaAcka() {
        String[] input = {"arh", "aun", "asd", "aeg","asc", "adf", "art" };
        String[] actual = poleDovnitrPoleVen.vratSubPole(input);
        assertArrayEquals(new String[]{"arh", "aun", "asd", "aeg","asc", "adf", "art" }, actual);
    }
    @Test
    void polePrazdnychRetezcuVratiSameNull() {
        String[] input = {"", ""};
        String[] actual = poleDovnitrPoleVen.vratSubPole(input);
        assertArrayEquals(new String[] {null, null},actual);

    }
    @Test
    void prazdnePoleVratiPrazdnePole() {
        String[] input = {};
        String[] actual = poleDovnitrPoleVen.vratSubPole(input);
        assertArrayEquals(new String[] {},actual);
    }
    @Test
    void poleNullVyhodiChybu() {
        assertThrows(NullPointerException.class, () ->
        {
            String[] input = {null};
            String[] actual = poleDovnitrPoleVen.vratSubPole(input);
        });
    }
}