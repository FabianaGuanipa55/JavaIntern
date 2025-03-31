import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Numeri {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer>numeri= new ArrayList<>();
        System.out.println("inserisci numeri interi: ");
     while (scanner.hasNextInt()){
         numeri.add(scanner.nextInt());
     }
     //ordino i numeri
        Collections.sort(numeri);
     //numeri ordinati
        System.out.println("Numeri ordinati");
        for(int numero:numeri){
            System.out.println (numero);
        }
        scanner.close();
    }
}
