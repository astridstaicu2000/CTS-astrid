package Teste;

import Clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @Test
    public void getSex() {
        Persoana persoana = new Persoana("Staicu", "60435678945368");

        assertEquals("F", persoana.getSex());
    }

    @Test
    public void boundayGetSex() {
        Persoana persoana = new Persoana("Staicu","39123456702345");
        Persoana persoana1 = new Persoana("Staicu","6217842034567");

        assertEquals("M",persoana.getSex());
        assertEquals("F",persoana1.getSex());
    }

    @Test
    public void crossCheckGetSex() {
        Persoana persoana = new Persoana("Staicu", "4193965104952");

        assertEquals(persoana.CNP.charAt(0)%2 == 1 ? "M" : "F", persoana.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorGetSex() {
        Persoana persoana = new Persoana("Staicu","0952267890356");

        persoana.getSex();
    }

    @Test(timeout = 100)
    public void performanceGetSex() {
        Persoana persoana = new Persoana("Staicu","2952267890356");

        persoana.getSex();
    }

    @Test
    public void conformanceGetSex() {
        Persoana persoana = new Persoana("Staicu","6834567203940");

        assertEquals("F", persoana.getSex());
    }

    @Test
    public void rangeGetSex() {
        Persoana persoana = new Persoana("Staicu","8445460965234");

        assertEquals("N/A", persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void existanceGetSex() {
        Persoana persoana = new Persoana("nume", null);

        persoana.getSex();
    }
}