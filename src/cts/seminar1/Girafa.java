package cts.seminar1;

public class Girafa extends Animal{
    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String tipHrana) {
        System.out.println("Girafa " + getNume() + " a mancat " + tipHrana);
    }
}
