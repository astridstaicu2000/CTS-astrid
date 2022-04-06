package ValidatoareTerestre;

public class ValidatorAutobuz implements ValidatorTerestru{
    @Override
    public void valideazaBilet() {
        System.out.println("A fost validat biletul");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul - autobuz");
    }
}
