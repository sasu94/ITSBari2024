import modelli.Calciatore;
import modelli.SquadraDiCalcio;

public class App {

    public static void main(String[] args) {
        Calciatore c = new Calciatore("salvatore", "monetti", 10, 100);
        c.stipendio=50000;
        
        Calciatore c2 = new Calciatore("dusan", "vlahovic", 0, 4000000);

        SquadraDiCalcio s = new SquadraDiCalcio("Juventus", "Torino", 1897);
        s.budget=10000000;

        s.add(c, 9);
        s.add(c2,2);

        System.out.println(s);
    }
}
