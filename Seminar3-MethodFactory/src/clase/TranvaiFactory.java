package clase;

public class TranvaiFactory implements MethodFactory{
    @Override
    public MijlocTransportComun creareMijlocTransportComun(String nrInmatriculare) {
        return new Tranvai(nrInmatriculare);
    }
}
