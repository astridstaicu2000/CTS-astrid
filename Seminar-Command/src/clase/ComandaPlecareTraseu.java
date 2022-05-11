package clase;

public class ComandaPlecareTraseu implements Comanda{

    private Integer linie;
    private Autobuz autobuz;

    public ComandaPlecareTraseu(Integer linie, Autobuz autobuz) {
        this.linie = linie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pleacaPeTraseu(linie);
    }
}
