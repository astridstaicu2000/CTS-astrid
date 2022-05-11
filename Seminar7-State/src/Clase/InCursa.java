package Clase;

public class InCursa implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatLinie) {
            System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " este in cursa");
            autobuz.setStare(this);
        }
    }
}
