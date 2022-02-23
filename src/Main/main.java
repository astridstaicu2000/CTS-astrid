package Main;

import cts.seminar1.Girafa;
import cts.seminar1.IngrijitorZoo;
import cts.seminar1.Zebra;
import cts.seminar1.Zoo;

public class main {
    public static void main(String[] args) {
        IngrijitorZoo ing = new IngrijitorZoo("ingrijitor");
        Zoo z1 = new Zoo("Gradina 1", ing);

        Zebra zebra1 = new Zebra("zebra1");
        Girafa girafa = new Girafa("girafa1");
        Zebra zebra2 = new Zebra("zebra2");

        z1.addAnimal(zebra1);
        z1.addAnimal(zebra2);
        z1.addAnimal(girafa);
        System.out.println(z1);

        z1.hranesteAnimale("iarba");
    }
}
