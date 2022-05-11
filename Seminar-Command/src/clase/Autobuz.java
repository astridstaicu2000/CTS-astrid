package clase;

public class Autobuz {
    private Integer nrInmatriculare;

    public void pleacaPeTraseu(Integer linie) {
        System.out.println("Autobuzul " + nrInmatriculare + "a plecat pe linia " + linie);
    }

    public Autobuz(Integer nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }
}
