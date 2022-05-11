package Clase;

public class LaReparat implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatLinie) {
            System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " a ajuns la reparat");
            autobuz.setStare(this);
        }
    }
}
