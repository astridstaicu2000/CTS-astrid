public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz = new Autobuz("8f4fh9w", "Ionel");
        MijlocTransport copieAutobuz =  autobuz.cloneaza();
        MijlocTransport copieAutobuz2 = autobuz.cloneaza();

        Tramvai tramvai = new Tramvai("43764gf", "Vatman");
        MijlocTransport copieTramvai = tramvai.cloneaza();

        System.out.println(autobuz);
        System.out.println(copieAutobuz);
        System.out.println(copieAutobuz2);

        System.out.println();
        System.out.println(tramvai);
        System.out.println(copieTramvai);
    }
}
