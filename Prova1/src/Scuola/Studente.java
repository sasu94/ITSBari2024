package Scuola;

public class Studente extends Persona{
    double mediaVoti;

    public Studente(String nome, String cognome, int eta, double mediaVoti) {
        super(nome, cognome, eta);
        this.mediaVoti = mediaVoti;
    }

    
}
