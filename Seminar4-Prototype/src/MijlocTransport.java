public abstract class MijlocTransport implements Cloneable{
    public String nrInmatriculare;

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract MijlocTransport cloneaza() throws CloneNotSupportedException;
}
