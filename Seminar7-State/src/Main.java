import Clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(232);
        autobuz.pleacaInCursa();
        autobuz.trimiteInService();
        autobuz.pleacaInCursa();
        autobuz.scoateDinService();
        autobuz.pleacaInCursa();
    }
}
