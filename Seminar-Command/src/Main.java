import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareTraseu;
import clase.InvokerOperator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(123);
        Autobuz autobuz2 = new Autobuz(345);

        Comanda comanda1 = new ComandaPlecareTraseu(1, autobuz1);

        InvokerOperator operator = new InvokerOperator();
        operator.adaugaComada(comanda1);
        operator.adaugaComada(new ComandaPlecareTraseu(2, autobuz2));
        operator.adaugaComada(new ComandaPlecareTraseu(2, autobuz1));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
