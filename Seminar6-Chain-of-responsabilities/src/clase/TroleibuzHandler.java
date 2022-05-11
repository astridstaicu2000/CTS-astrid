package clase;

public class TroleibuzHandler extends TransportHandler{
    @Override
    public void deplaseazaRequest(int distanta) {
        if(distanta < 3)
        {
            System.out.println("Iau troleibuzul, dist parcursa: " + distanta);
        }
        else
        {
            this.nextHandler.deplaseazaRequest(distanta);
        }
    }
}
