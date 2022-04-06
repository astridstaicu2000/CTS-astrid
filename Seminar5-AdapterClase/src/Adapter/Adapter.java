package Adapter;

import ValidatoareSubterane.ValidatorMetrou;
import ValidatoareSubterane.ValidatorSubteran;
import ValidatoareTerestre.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {

    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}
