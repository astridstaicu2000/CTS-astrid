public class Tramvai extends MijlocTransport{

    private String numeVatman;

    public Tramvai(String nrInmatriculare, String numeVatman) {
        super(nrInmatriculare);
        this.numeVatman = numeVatman;
    }

    public String getNumeVatman() {
        return numeVatman;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", numeVatman='").append(numeVatman).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setNumeVatman(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public MijlocTransport cloneaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }
}
