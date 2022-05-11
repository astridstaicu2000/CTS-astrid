package Decoratori;

import Clase.Printer;

public class DecoratorOcazional extends Decorator {
    private String mesaj;

    public DecoratorOcazional(Printer printer, String mesaj) {
        super(printer);
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaMesaj() {
        System.out.println(mesaj);
    }
}
