import Clase.Tramvai;
import Clase.TramvaiAbstract;
import Clase.TramvaiProbe;

public class Main {
    public static void main(String[] args) {
        TramvaiAbstract tramvai = new Tramvai();
        TramvaiAbstract tramvaiProba = new TramvaiProbe();

        tramvai.parcurgereTraseuDus();
        tramvai.parcurgereTraseuInvers();

        System.out.println();

        tramvaiProba.parcurgereTraseuDus();
        tramvaiProba.parcurgereTraseuInvers();
    }
}
