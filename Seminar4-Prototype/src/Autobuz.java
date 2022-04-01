public class Autobuz extends MijlocTransport{
    private String numeSofer;

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Autobuz(String nrInmatriculare, String numeSofer) {
        super(nrInmatriculare);
        this.numeSofer = numeSofer;
    }

    @Override
    public MijlocTransport cloneaza() throws CloneNotSupportedException {
        return (MijlocTransport)this.clone();
    }
}
