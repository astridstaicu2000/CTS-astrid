package Clase;

public class Autobuz {

    private StareAutobuz stare;
    private Integer nrAutobuz;

    public StareAutobuz getStare() {
        return stare;
    }

    protected void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public Autobuz(Integer nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public Integer getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(Integer nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa()
    {
        StareAutobuz incursa = new InCursa();
        incursa.modificaStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        StareAutobuz capatLinie = new LaCapatLinie();
        capatLinie.modificaStare(this);
    }

    public void trimiteInService() {
        StareAutobuz laReparat = new LaReparat();
        laReparat.modificaStare(this);
    }

    public void scoateDinService() {
        StareAutobuz laCapatDeLinie = new LaCapatLinie();
        laCapatDeLinie.modificaStare(this);
    }
}
