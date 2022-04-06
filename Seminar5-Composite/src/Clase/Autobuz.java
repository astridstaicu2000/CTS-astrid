package Clase;

import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Autobuz implements NodAbstract{

    private String producator;
    private String model;
    private Integer nrLocuri;

    public Autobuz(String producator, String model, Integer nrLocuri)
    {
        super();
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }
    @Override
    public void afiseazaDescriere() throws Exception{
        System.out.println(this.toString());
    }

    @Override
    public NodAbstract get(Integer pozitie) {
        return null;
    }

    @Override
    public void add(NodAbstract nod) throws Exception {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void remove(NodAbstract nod) throws Exception {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
