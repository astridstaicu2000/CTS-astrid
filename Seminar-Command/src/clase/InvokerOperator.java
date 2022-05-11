package clase;

import java.util.ArrayList;
import java.util.List;

public class InvokerOperator {
    private List<Comanda> comenzi;

    public InvokerOperator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComada(Comanda comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if(comenzi!=null && comenzi.size() > 0)
            comenzi.remove(0).executa();
    }


}
