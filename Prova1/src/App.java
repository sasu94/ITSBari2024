import GestioneOrario.Orario;
import GestioneOrario.TipoOrario;

public class App {

    public static void main(String[] args) {
        Orario o = new Orario();
        o.setOra(9);
        o.setMinuti(16);
        o.setSecondi(32);
        o.calcolaAggiunta(24, TipoOrario.ORA);
        o.calcolaAggiunta(10, TipoOrario.SECONDI);
        System.out.println(o);
    }
}
