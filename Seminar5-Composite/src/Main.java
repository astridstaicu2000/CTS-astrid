import Clase.Autobuz;
import Clase.GrupAutobuze;
import Clase.NodAbstract;

import java.util.List;

public class Main {
    public static void main(String[] args){
        NodAbstract a1 = new Autobuz("Dacia", "model1", 7);
        NodAbstract a2 = new Autobuz("Dacia", "model1", 12);
        NodAbstract a3 = new Autobuz("Dacia", "model1", 45);

        NodAbstract grupMic = new GrupAutobuze("Grup mic");
        NodAbstract grupMare = new GrupAutobuze("Grup mare");
        NodAbstract flota = new GrupAutobuze("Flota");

        try {
            grupMic.add(a1);
            grupMic.add(a2);
            grupMare.add(a3);
            flota.add(grupMic);
            flota.add(grupMare);
            flota.afiseazaDescriere();
        } catch (Exception ex) {
        }

    }
}
