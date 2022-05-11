package Clase;

public class Calator implements Observer{

    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(Integer nrLinie, String mesaj) {
        System.out.println("Calatorul" + nume + "a primit mesajul" + mesaj + " " + nrLinie + ".");
    }
}
