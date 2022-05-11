import Clase.Autobuz;
import Clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz;
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuz = autobuzBuilder.build();
        System.out.println(autobuz);

        Autobuz autobuz2 = new AutobuzBuilder().setModel("Dacia").setIsNew(true).build();
        System.out.println(autobuz2);
    }
}
