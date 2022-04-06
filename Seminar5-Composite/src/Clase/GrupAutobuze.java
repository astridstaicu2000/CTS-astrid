package Clase;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuze implements NodAbstract {

    List<NodAbstract> lista = new ArrayList<>();
    private String denumire;

    public GrupAutobuze(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() throws Exception {
        System.out.println("Denumire: " + denumire);
        System.out.println();
        for (NodAbstract nod : lista) {
            nod.afiseazaDescriere();
        }
    }

    @Override
    public NodAbstract get(Integer pozitie) {
        return lista.get(pozitie);
    }

    @Override
    public void add(NodAbstract nod) {
        lista.add(nod);
    }

    @Override
    public void remove(NodAbstract nod) {
        lista.remove(nod);
    }
}
