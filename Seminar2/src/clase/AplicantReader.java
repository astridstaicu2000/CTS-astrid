package clase;

import java.util.Scanner;

public abstract class AplicantReader implements Reader{

    public void readAplicant(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setDenumiriProiecte(nr, vect);
        aplicant.setPunctaj(punctaj);
        aplicant.setVarsta(varsta);
    }
}
