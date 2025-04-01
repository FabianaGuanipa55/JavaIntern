import java.util.InputMismatchException;
import java.util.Scanner;
public class CalcolaQuadrato {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        int numero;
        try {
            System.out.println("Inserisci un numero");
            numero= scanner.nextInt();
            int quadrato = numero*numero;
            System.out.println("il quadrato del numero: " + quadrato);
        }catch (InputMismatchException e) {
            System.out.println("Errore questo input non valido");
            scanner.close();
        }
    }

}
