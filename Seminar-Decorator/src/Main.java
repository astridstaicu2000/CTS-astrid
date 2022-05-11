import Clase.Printer;
import Clase.PrinterBilet;
import Decoratori.Decorator;
import Decoratori.DecoratorOcazional;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterBilet();
        printer.printeazaBilet();

        Decorator printerOcazional = new DecoratorOcazional(printer,"La multi ani!");
        printerOcazional.printeazaBilet();
        printerOcazional.printeazaMesaj();
    }
}
