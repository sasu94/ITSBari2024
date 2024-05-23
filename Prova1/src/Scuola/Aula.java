package Scuola;

public class Aula {
    String nomeAula;
    Persona[] persone;
    
    public Aula(String nomeAula, Persona[] persone) {
        this.nomeAula = nomeAula;
        this.persone = persone;
    }

    public double mediaEta(){
        int sommaParziale=0;
        for (Persona persona : persone) {
            sommaParziale+=persona.eta;
        }
        return sommaParziale/persone.length;
    }

    public double mediaEtaStudenti(){
        int sommaParziale=0;
        int numStudenti=0;
        for (Persona persona : persone) 
        {
            if(persona instanceof Studente){
                sommaParziale+= persona.eta;
                numStudenti++;
            }
        }
        return (double)sommaParziale/numStudenti;
    }

    public void stampaMediaPerStudenti(){
        for (Persona persona : persone) {
            if (persona instanceof Studente){
                Studente s = (Studente)persona;
                System.out.println(s.cognome+" ,media:"+s.mediaVoti);
            }
        }
    }
    
}
