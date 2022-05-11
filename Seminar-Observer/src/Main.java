import Clase.Autobuz;
import Clase.Calator;
import Clase.Observer;
import Clase.Subject;

public class Main {
    public static void main(String[] args) {
        Subject autobuz = new Autobuz(12);
        Observer calator1 = new Calator("Dorel");
        autobuz.aboneaza(calator1);
        Observer calator2 = new Calator("Gigel");
        autobuz.aboneaza(calator2);
        Observer calator3 = new Calator("Marcel");
        autobuz.aboneaza(calator3);

        ((Autobuz)autobuz).notifica("Autobuzul a ajuns la capatul liniei");

        autobuz.dezaboneaza(calator3);

        System.out.println();

        ((Autobuz)autobuz).notifica("Autobuzul a ajuns la capatul liniei");
    }
}
