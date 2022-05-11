import Clase.Autobuz;
import Clase.ManagerAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Ion", 2010, "Mercedes", 30, 5);
        ManagerAutobuz manager = new ManagerAutobuz();

        manager.adaugaMemento(autobuz.genereazaMemnto());
        System.out.println(autobuz);

        autobuz.setNumeSofer("Viorel");
        manager.adaugaMemento(autobuz.genereazaMemnto());
        System.out.println(autobuz);

        autobuz.setConsumMediu(6);
        manager.adaugaMemento(autobuz.genereazaMemnto());
        System.out.println(autobuz);

        autobuz.revineLaOStareAnterioara(manager.getMemento(0));
        System.out.println(autobuz);
    }
}
