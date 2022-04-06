package Clase;

public interface NodAbstract {

    void afiseazaDescriere() throws Exception;

    NodAbstract get(Integer pozitie);

    void add(NodAbstract nod) throws Exception;

    void remove(NodAbstract nod) throws Exception;
}
