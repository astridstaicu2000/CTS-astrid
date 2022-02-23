package cts.seminar1;

public class Zebra extends Animal{

    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String tipHrana) {
        System.out.println("Zebra " + getNume() + " a mancat " + tipHrana);
    }
}
