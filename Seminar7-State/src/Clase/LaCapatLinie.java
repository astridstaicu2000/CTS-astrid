package Clase;

public class LaCapatLinie implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(!(autobuz.getStare() instanceof LaCapatLinie)) {
            System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " este la capat de linie");
            autobuz.setStare(this);
        }
    }
}
