package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader{

    StudentiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Student student = new Student();
            readAplicant(scanner, student);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            //Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
            student.setFacultate(facultate);
            student.setAnStudii(an_studii);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}
