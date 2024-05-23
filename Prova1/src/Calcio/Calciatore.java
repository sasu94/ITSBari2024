package Calcio;

public class Calciatore {
    public String nome;
    public String cognome;
    public int numeroMaglia;
    public double stipendio;

    

    @Override
    public String toString() {
        return "Calciatore [nome=" + nome + ", cognome=" + cognome + ", numeroMaglia=" + numeroMaglia + ", stipendio="
                + stipendio + "]";
    }



    public Calciatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }



    public Calciatore(String nome, String cognome, int numeroMaglia, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroMaglia = numeroMaglia;
        this.stipendio = stipendio;
    }

        
}
