package Teste;

import Clase.Matematica;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTests {

    private Matematica matematica;

    @Before
    public void setup() {
        matematica = new Matematica();
    }

    @Test
    public void testSumaCorecta() {
        int rezultat = matematica.suma(5,9);

        assertEquals(14, rezultat);
    }

    @Test
    public void testRaportCorect() {
        double rezultat = matematica.raport(24,6);

        assertEquals(4.0,rezultat,0.01);
    }

    @Test
    public void testRaportZecimalCorect() {
        double rezultat = matematica.raport(27,6);

        assertEquals(4.5, rezultat, 0.01);
    }

    @Test
    public void testRaportShouldThrowException() {
        try {
            matematica.raport(2,0);
            fail("Nu trebuia sa ajunga aici!");
        }
        catch(IllegalArgumentException exception) {

        }
    }

    @Test
    public void testEsteParCorect() {
        assertTrue(matematica.estePar(6));
        assertTrue(matematica.estePar(18));
        assertTrue(matematica.estePar(78));
        assertFalse(matematica.estePar(55));
    }

    @Test
    public void testNNumerePareListNotNull() {
        List<Integer> rezultat = matematica.nNumerePare(2);
        assertNotNull(rezultat);
    }

}