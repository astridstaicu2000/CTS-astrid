package ValidatoareSubterane;

public class ValidatorMetrou implements  ValidatorSubteran{
    @Override
    public void valideazaCalatorie() {
        System.out.println("A fost validata calatoria");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul - metrou");
    }
}
