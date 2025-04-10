package product;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Libro libro=new Libro("il libro senza titolo", "Anna Neri", 56.50,10);
        System.out.println("Inserisci la quantita dell'articolo libro e ti do il prezzo");
        Scanner scanner= new Scanner(System.in);
        int quantitaInserita = scanner.nextInt();
        if(quantitaInserita< libro.getQuatita()){
            System.out.println("il prezzo del libro è: "+ libro.getPrezzo());
        }else{
            System.out.println("non abbiamo questa quantità di libri, cio ciao" + libro.getQuatita());
        }

    }
}
