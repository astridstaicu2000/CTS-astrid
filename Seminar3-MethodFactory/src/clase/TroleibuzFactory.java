package clase;

public class TroleibuzFactory implements MethodFactory{
    @Override
    public MijlocTransportComun creareMijlocTransportComun(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
