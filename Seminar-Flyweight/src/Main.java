import clase.Autobuz;
import clase.AutobuzLinie;
import clase.FabricaLinii;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("A1", 1999, 20);
        Autobuz a2 = new Autobuz("A2", 2005, 25);
        Autobuz a3 = new Autobuz("A3", 2012, 20);
        Autobuz a4 = new Autobuz("A4", 2020, 14);

        FabricaLinii fabricaLinii = new FabricaLinii();
        AutobuzLinie linie1 = fabricaLinii.getLinie(12);
        AutobuzLinie linie2 = fabricaLinii.getLinie(26);

        linie1.afisazaDescriere(a1);
        linie2.afisazaDescriere(a2);
        linie2.afisazaDescriere(a3);
        linie1.afisazaDescriere(a4);
    }
}
