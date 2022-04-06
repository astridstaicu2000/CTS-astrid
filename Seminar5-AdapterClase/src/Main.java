import Adapter.Adapter;
import ValidatoareSubterane.ValidatorMetrou;
import ValidatoareSubterane.ValidatorSubteran;
import ValidatoareTerestre.ValidatorAutobuz;
import ValidatoareTerestre.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorSubteran validatormetrou = new ValidatorMetrou();
        ValidatorTerestru validaorTerestru = new ValidatorAutobuz();

        ValidatorTerestru adapter = new Adapter();
        adapter.valideazaBilet();
    }
}
