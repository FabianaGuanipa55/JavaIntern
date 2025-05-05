package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Somma {
    public static void main (String[] args){
        //1. Scrivi un programma Java usando una Lambda Expression per trovare la somma di due numeri interi
        CalcolatoreSomma calcolatore = (a,b) -> a + b;
        int risultato = calcolatore.calcola(10,20);
        System.out.println("Il risultato della somma è: " + risultato);
        System.out.println("-----------------------------------------");
    //9. Scrivi un programma Java usando una Lambda Expression per calcolare la somma di tutti i numeri pari
        List<Integer> numeriPari= Arrays.asList (1,2,3,4,5,6,7,8,9);
        int sommaPari = numeriPari.stream()
                .filter(n->n %2==0)
                .mapToInt(n->n)
                .sum();
        System.out.println("Somma dei numeri pari: " + sommaPari);
        System.out.println("-----------------------------------------");
    // 10. Scrivi un programma Java usando una Lambda Expression per calcolare la somma di tutti i numeri dispari
        List<Integer> numeriDispari= Arrays.asList (1,2,3,4,5,6,7,8,9,3,7,9);
        int sommaDispari = numeriPari.stream()
                .filter(n->n %2!=0)
                .mapToInt(n->n)
                .sum();
        System.out.println("Somma dei numeri dispari: " + sommaDispari);
        System.out.println("-----------------------------------------");
        //3.	Scrivi un programma Java usando una Lambda Expression per filtrare i numeri pari da una lista di numeri interi
        List<Integer> pari= Arrays.asList (50,32,77,90,40,30,100,17,14);
        List<Integer> filtraPari = pari.stream()
                .filter(n->n %2==0)
                        .collect(Collectors.toList());
        System.out.println(" i numeri pari sono: " + filtraPari);
        System.out.println("-----------------------------------------");

       // 4.	Scrivi un programma Java usando una Lambda Expression per filtrare i numeri dispari da una lista di numeri interi
        List<Integer> dispari= Arrays.asList (50,32,77,90,40,30,100,17,14,99,13);
        List <Integer> filtraDispari = dispari.stream()
                .filter(n->n %2!=0)
                .collect(Collectors.toList());
        System.out.println(" i numeri dispari sono: " + filtraDispari);
        System.out.println("-----------------------------------------");
        //6.	Scrivi un programma Java usando una Lambda Expression per calcolare la media di una lista di numeri double
        List<Double> listaDou = Arrays.asList (1.2,2.3,4.5,6.7,8.9);
        double media = listaDou.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println(" la media dei numeri è " + media);
        System.out.println("-----------------------------------------");
        //7.	Scrivi un programma Java usando una Lambda Expression per rimuovere i duplicati da una lista di numeri interi
        List<Integer> duplicati= Arrays.asList(1,1,2,2,2,3,4,5,6,6,6,6,6);
        duplicati.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("-----------------------------------------");
        //13.	Scrivi un programma Java usando una Lambda Expression per trovare il valore massimo in una lista di numeri interi
        //14.	Scrivi un programma Java usando una Lambda Expression per trovare il valore minimo in una lista di numeri interi
        List<Integer> numeri= Arrays.asList (50,32,77,90,40,30,100,17,14,99,13);
        int max = numeri.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("Lista vuota"));
        int min = numeri.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("Lista vuota"));
        System.out.println("il numero massimo è: " + max);
        System.out.println("il numero minimo è: " + min);

    }
    //1
    interface CalcolatoreSomma{
        int calcola(int a, int b);
    }

}
