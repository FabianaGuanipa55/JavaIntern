package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class calcoli {
    private static int sommaQuadrati;

    public static void main(String[] args) {
        //15.	Scrivi un programma Java usando una Lambda Expression per moltiplicare e sommare tutti gli elementi in una lista di numeri interi
        //41.	Scrivi un programma Java usando una Lambda Expression per trovare il numero pari più grande in una lista di numeri interi
        //42.	Scrivi un programma Java usando una Lambda Expression per trovare il secondo numero più grande in una lista di numeri interi
        List<Integer> numeriInteri = Arrays.asList(60, 40, 90, 4, 2);
        int somma = numeriInteri.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int prodotto = numeriInteri.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("il risultato della somma è: " + somma + " |" + " il risultato della molteplicazione è: " + prodotto);
        System.out.println("--------------------41--------------------");
        int maxPari = numeriInteri.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("il numero massimo è: " + maxPari);
        System.out.println("--------------------42--------------------");
        int maxSecond = numeriInteri.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("il secondo numero piu grande della lista è: " + maxSecond);
        System.out.println("------------------------------------------");
        //35.	Scrivi un programma Java usando una Lambda Expression per trovare il prodotto di tutti i numeri dispari in una lista di numeri interi
        //44.	Scrivi un programma Java usando una Lambda Expression per trovare la somma dei quadrati dei numeri dispari in una lista di numeri interi
        List<Integer> numeriDispari = Arrays.asList(1, 3, 5, 7, 9);
        int prodottoDispari = numeriDispari.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("il prodotto è : " + prodottoDispari);
        System.out.println("--------------------44--------------------");
        int sommaQuadrati = numeriDispari.stream()
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("la somma dei quadrati è : " + sommaQuadrati);
        System.out.println("------------------------------------------");

        //32.	Scrivi un programma Java usando una Lambda Expression per trovare la differenza tra il valore massimo e minimo in una lista di numeri double
        //40.	Scrivi un programma Java usando una Lambda Expression per trovare la radice quadrata di ciascun numero in una lista di numeri double
        List<Double> listaDouble = Arrays.asList(1.3, 1.5, 2.6, 3.7,5.1,9.7);
        double diff= Collections.max(listaDouble)-Collections.min(listaDouble);
        System.out.println("la differenza tra il valore max e min della lista è: " + diff);
        System.out.println("--------------------40--------------------");
        List <Double> radiciQuadrata = listaDouble.stream()
                        .map(Math::sqrt)
                                .collect(Collectors.toList());
        System.out.println("la radice quadrata dei numeri della lista è: " + radiciQuadrata);
        System.out.println("------------------------------------------");
        //27.	Scrivi un programma Java usando una Lambda Expression per trovare il quadrato di ciascun numero dispari in una lista di numeri interi
        //30.	Scrivi un programma Java usando una Lambda Expression per calcolare il prodotto di tutti i numeri pari in una lista di numeri interi
        //24.	Scrivi un programma Java usando una Lambda Expression per trovare i numeri primi in una lista di numeri interi
        //16.	Scrivi un programma Java usando una Lambda Expression che prenda una lista di numeri e restituisca il quadrato di ciascun numero
        List<Integer> numeri = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numeri.stream()
                .filter(n-> n %2!=0)
                .map(n->n *n)
                .forEach(System.out::println);
        System.out.println("--------------------30--------------------");
        int prodottoNumeriPari = numeri.stream()
                .filter(n-> n %2==0 )
                .reduce(1,(a,b)-> a*b);
        System.out.println("il prodotto dei numeri pari è: " + prodottoNumeriPari);
        System.out.println("--------------------24--------------------");
        Predicate<Integer> isPrimo = n->n >1 && IntStream.range(2,n)
                .allMatch(i->n%i!=0);
        numeri.stream()
                .filter(isPrimo)
                .forEach(System.out::println);
        System.out.println("--------------------16--------------------");
        numeri.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
        System.out.println("------------------------------------------");
        //11.	Scrivi un programma Java usando una Lambda Expression per calcolare il fattoriale di un numero dato
        int numero = 5;

        int fattoriale = IntStream.rangeClosed(1, numero)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);

    }


}


