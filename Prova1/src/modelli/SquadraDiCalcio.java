package modelli;

public class SquadraDiCalcio {
    public String nome;
    public String sede;
    public int annoDiFondazione;
    public double budget;
    public double sommaStipendi;
    public int punti;
    public int goal;
    public Calciatore[] calciatori;
    private int calciatoriInSquadra;

    public SquadraDiCalcio(String nome, String sede, int annoDiFondazione) {
        this.nome = nome;
        this.sede = sede;
        this.annoDiFondazione = annoDiFondazione;
        calciatori =  new Calciatore[11];
        calciatoriInSquadra=0;
    }

    public void add(Calciatore c, int i){
        calciatori[i]=c;
        calcolaSommaStipendi(c.stipendio);
    }
    
    public void add(Calciatore c){
        calciatori[calciatoriInSquadra]=c;
        calciatoriInSquadra++;
    }

    private void calcolaSommaStipendi(double stipendio){
        sommaStipendi+=stipendio;
    }

    @Override
    public String toString() {
        return "SquadraDiCalcio [nome=" + nome + ", budget=" + budget + ", sommaStipendi=" + sommaStipendi + ", punti="
                + punti + ", goal=" + goal + ",]";
    }

    

}
