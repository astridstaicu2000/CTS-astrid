package clase;

public class AutobuzFactory implements MethodFactory{
    @Override
    public MijlocTransportComun creareMijlocTransportComun(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
