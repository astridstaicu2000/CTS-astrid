import Adapter.Adapter;
import ValidatoareSubterane.ValidatorMetrou;
import ValidatoareSubterane.ValidatorSubteran;
import ValidatoareTerestre.ValidatorAutobuz;
import ValidatoareTerestre.ValidatorTerestru;

public class Main {
    public static void valideazaBilet(ValidatorTerestru validator) {
        validator.valideazaBilet();
    }

    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        ValidatorSubteran validatorMetrou = new ValidatorMetrou();

        valideazaBilet(validatorAutobuz);
        Adapter adapter = new Adapter(validatorMetrou);
        valideazaBilet(adapter);
    }
}
