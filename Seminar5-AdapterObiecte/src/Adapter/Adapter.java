package Adapter;

import ValidatoareSubterane.ValidatorMetrou;
import ValidatoareSubterane.ValidatorSubteran;
import ValidatoareTerestre.ValidatorTerestru;

public class Adapter implements ValidatorTerestru {
    ValidatorSubteran validatorMetrou;

    public Adapter(ValidatorSubteran validatorMetrou){
        super();
        validatorMetrou = new ValidatorMetrou();
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
