package clase;

public class Autobuz {
    private String model;
    private Integer anfabricatie;
    private Integer nrLocuri;

    public Autobuz(String model, Integer anFabricatie, Integer nrLocuri) {
        this.model = model;
        this.anfabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anfabricatie=").append(anfabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
