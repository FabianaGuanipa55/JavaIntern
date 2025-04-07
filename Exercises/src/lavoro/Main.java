
package lavoro;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args) {
        List<Dipendente> dipendente = new ArrayList<Dipendente>();
        dipendente.add(new Manager());
        dipendente.add(new Operaio());
        System.out.println("Elenco dipendenti: "+ dipendente);
        Manager manager= new Manager();
        Operaio operaio= new Operaio();

    }
}

