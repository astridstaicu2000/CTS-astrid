public class Main {
    public static void main(String[] args) {
        MijlocTransportComun autobuz = CreatorMijlocTransport.creareMijlocTransport(TipMijlocTransport.Autobuz, "autobuz1");
        MijlocTransportComun troleibuz = CreatorMijlocTransport.creareMijlocTransport(TipMijlocTransport.Troleibuz, "troleibuz1");
        MijlocTransportComun tranvai = CreatorMijlocTransport.creareMijlocTransport(TipMijlocTransport.Tranvai, "tranvai1");

        System.out.println(autobuz.nrInmatriculare);
        System.out.println(tranvai.nrInmatriculare);
        System.out.println(troleibuz.nrInmatriculare);
    }
}
