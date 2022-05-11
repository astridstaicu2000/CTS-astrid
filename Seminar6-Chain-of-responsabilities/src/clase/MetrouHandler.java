package clase;

public class MetrouHandler extends TransportHandler{
    @Override
    public void deplaseazaRequest(int distanta) {
        System.out.println("Merg cu metroul, distanta parcursa: " + distanta);
    }
}
