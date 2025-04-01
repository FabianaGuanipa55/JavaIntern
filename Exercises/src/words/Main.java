package words;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parole parole = new Parole();
        int scelta;

        do {
            System.out.println("scegli un'operazione:");
            System.out.println("1. inserisci delle parole");
            System.out.println("2. ordina parole");
            System.out.println("3. concatena parole");
            System.out.println("4. conta caratteri");
            System.out.println("0. esci");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    parole.inserisciParole();
                    break;
                case 2:
                    if (parole.sonoPresentiParole()) {
                        parole.ordinaParole();
                    } else {
                        System.out.println("iserisci una parola");
                    }
                    break;
                case 3:
                    if (parole.sonoPresentiParole()) {
                        parole.concatenaParole();
                    } else {
                        System.out.println("iserisci una parola");
                    }
                    break;
                case 4:
                    if (parole.sonoPresentiParole()) {
                        parole.contaCaratteri();
                    } else {
                        System.out.println("iserisci una parola");
                    }
                    break;
                case 0:
                    System.out.println("iserisci una parola");
                    break;
                default:
                    System.out.println("errore");
            }
        } while (scelta != 0);

        scanner.close();
    }
}


