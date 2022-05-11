package clase;

public class AutobuzHandler extends TransportHandler{
    @Override
    public void deplaseazaRequest(int distanta) {
        if(distanta < 10) {
            System.out.println("Merg cu autobuzul, distanta parcursa: " + distanta);
        }
        else {
            this.nextHandler.deplaseazaRequest(distanta);
        }
    }
}
