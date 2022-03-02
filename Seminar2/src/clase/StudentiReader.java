package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            readAplicant(input, student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            //Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
            student.setFacultate(facultate);
            student.setAn_studii(an_studii);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
