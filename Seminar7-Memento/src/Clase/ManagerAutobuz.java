package Clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    List<AutobuzMemento> momente;

    public ManagerAutobuz() {
        momente = new ArrayList<>();
    }

    public void adaugaMemento(AutobuzMemento autobuzMemento) {
        momente.add(autobuzMemento);
    }

    public AutobuzMemento getMemento(Integer index) {
        return momente.get(index);
    }
}
