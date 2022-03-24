import clase.AutobuzFactory;
import clase.MijlocTransportComun;
import clase.TranvaiFactory;
import clase.TroleibuzFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzFactory autobuzFactory = new AutobuzFactory();
        TranvaiFactory tranvaiFactory = new TranvaiFactory();
        TroleibuzFactory troleibuzFactory = new TroleibuzFactory();

        MijlocTransportComun autobuz = autobuzFactory.creareMijlocTransportComun("fuiwrb");
        MijlocTransportComun troleibuz = troleibuzFactory.creareMijlocTransportComun("fuiwrb");
        MijlocTransportComun tranvai = tranvaiFactory.creareMijlocTransportComun("fuiwrb");

        System.out.println(autobuz.getNrInmatriculare());
        System.out.println(troleibuz.getNrInmatriculare());
        System.out.println(tranvai.getNrInmatriculare());
    }
}
