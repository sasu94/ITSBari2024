package GestioneOrario;

public class Orario {
    private int ora;
    private int minuti;
    private int secondi;

    public int getOra(){
        return ora;
    }

    public void setOra(int ora){
        if(ora >= 0 && ora < 24){
            this.ora=ora;
        }else{
            System.out.println("ouuu");
        }
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        if(minuti>=0 && minuti < 60){
            this.minuti = minuti;
        }
    }

    public int getSecondi() {
        return secondi;
    }

    public void setSecondi(int secondi) {
        if(secondi>=0 && secondi < 60){
            this.secondi = secondi;
        }
    }

    public String calcolaAggiunta(int aggiunta, TipoOrario tipo){
        switch (tipo) {
            case ORA:
                setOra(ora+aggiunta);
                break;
            case MINUTI:
                minuti+=aggiunta;    
                break;
            case SECONDI: 
                secondi+=aggiunta;
                break;
        }
        return toString();
    }

    @Override
    public String toString() {
        return getOra()+":"+minuti+":"+secondi;
    }

    

    
}
