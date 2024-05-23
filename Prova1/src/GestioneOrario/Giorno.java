package GestioneOrario;

public class Giorno {
    private int giorno;
    private int mese;
    private int anno;
    
    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        if ((giorno < 0 | giorno > 31)){
            System.out.println("Errore, giorno non valido");
        }else if(mese==2 & giorno > 28){
            System.out.println("Hai inserito un giorno non valido per Febbraio, inserisci tra 1 e 28");
        }else if((mese == 11 || mese == 6) && giorno>30) {
            System.out.println("Errore, giorno non valido occhio che deve arrivare a 30");
        }else{
            this.giorno = giorno;
        }

    }
    public int getMese() {
        return mese;
    }
    public void setMese(int mese) {
        this.mese = mese;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }

    
}
