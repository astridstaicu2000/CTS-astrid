package clase;

public class Linie implements AutobuzLinie{

    private Integer nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(Integer nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getNrLinie() {
        return this.nrLinie;
    }

    @Override
    public void afisazaDescriere(Autobuz autobuz) {
        System.out.println("Autobuz linie: " + this + autobuz);
    }
}
