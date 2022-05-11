import clase.AutobuzHandler;
import clase.MetrouHandler;
import clase.TransportHandler;
import clase.TroleibuzHandler;

public class Main {
    public static void main(String[] args) {
        TransportHandler autobuzHandler = new AutobuzHandler();
        TransportHandler metrouHandler = new MetrouHandler();
        TransportHandler troleibuzHandler = new TroleibuzHandler();

        troleibuzHandler.setNextHandler(autobuzHandler);
        autobuzHandler.setNextHandler(metrouHandler);

        troleibuzHandler.deplaseazaRequest(9);
        troleibuzHandler.deplaseazaRequest(2);
        troleibuzHandler.deplaseazaRequest(100);
    }
}
