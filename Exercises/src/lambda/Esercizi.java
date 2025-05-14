package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Esercizi {
    public static void main(String[] args) {
        //1.Hai una lista di stringhe:
        //List<String> parole = Arrays.asList("cane", "gatto", "elefante", "orso");
        //Ordina la lista in ordine alfabetico inverso usando una lambda expression.
        List<String> parole = Arrays.asList("cane", "gatto", "elefante", "orso");
        System.out.println("Lista originale: " + parole);
        parole.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Lista ordinata: " + parole);
        System.out.println("------------------------------------------");
        //2.Crea un’interfaccia funzionale chiamata Operazione con un metodo int esegui(int a, int b);.
        //Usa lambda expressions per implementare somma, sottrazione, moltiplicazione e divisione.
        Operazione somma = (int a, int b) -> a + b;
        Operazione sottrazione = (int a, int b) -> a - b;
        Operazione moltiplicazione = (int a, int b) -> a * b;
        Operazione divisione = (int a, int b) -> a / b;
        System.out.println(somma.calcola(5, 5));
        System.out.println(sottrazione.calcola(10, 2));
        System.out.println(moltiplicazione.calcola(50, 50));
        System.out.println(divisione.calcola(8, 4));
        System.out.println("------------------------------------------");
        //3.Hai questa lista:
        //List<String> nomi = Arrays.asList("Luca", "Anna", "Alessandro", "Gio", "Luna");
        //Filtra i nomi che iniziano con "A" usando removeIf con una lambda.
        List<String> nomi = Arrays.asList("Luca", "Anna", "Alessandro", "Gio", "Luna");
        System.out.println("Lista originale: " + nomi);
        System.out.println("Nomi che iniziano con la lettera A: ");
        nomi.stream()
                .filter(nome -> nome.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("------------------------------------------");
        //4.Hai questa lista di numeri:
        //List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //Usa gli stream per ottenere la somma dei numeri pari.
        List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sommaPari = numeri.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("il totale della somma dei numeri pari è: " + sommaPari);
        System.out.println("------------------------------------------");
        //5.Hai:
        //List<String> parole = Arrays.asList("casa", "automobile", "penna", "luna", "sole");
        //Calcola la lunghezza media delle parole nella lista.
        List<String> paroleParole = Arrays.asList("casa", "automobile", "penna", "luna", "sole");
        double media = paroleParole.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println("La lunghezza media delle parole della lista è di: " + media);
        System.out.println("------------------------------------------");
        //6.Hai:
        //List<Integer> numeri = Arrays.asList(1, 3, 9, 14, 8, 25);
        //Trova il primo numero maggiore di 10 usando findFirst() e gestiscilo con Optional.
        List<Integer> listaNumeri = Arrays.asList(1, 3, 9, 14, 8, 25);
        Optional<Integer> trovaNumero = listaNumeri.stream()
                .filter(n -> n > 10)
                .findFirst();
        System.out.println(trovaNumero);
        System.out.println("------------------------------------------");
        //7.Hai:
        //List<String> animali = Arrays.asList("gatto", "elefante", "topo", "cane");
        //Crea una Map<String, Integer> dove la chiave è la parola e il valore la lunghezza.
        List<String> animali = Arrays.asList("gatto", "elefante", "topo", "cane");
        Map<String, Integer> mappa = animali.stream()
                .collect(Collectors.toMap(a -> a, a -> a.length()));
        System.out.println(mappa);
        System.out.println("------------------------------------------");
        //* Given an array of integers like {5,6,7,8)
        // * Find the sum of the all the elements in the array.
        // * The output should be in this case is: 26.
        int [] arrayIntegers= {5,6,7,8};
        System.out.println(Arrays.toString(arrayIntegers));
        int sommaArray = Arrays.stream(arrayIntegers).sum();
        System.out.println("La somma di tutti gli elementi dell'array è di: " + sommaArray);
        System.out.println("------------------------------------------");
        //* Given an array of {5,6,7,8,5,5,8,8,7)
        // * Find the sum of the unique elements.
        // * The output should be in this case is: 26.
        int [] arrayNumeri = {5,6,7,8,5,5,8,8,7};
        System.out.println(Arrays.toString(arrayNumeri));
        int sommaUnici = Arrays.stream(arrayNumeri)
                .distinct()
                .sum();
        System.out.println("Totale somma degli elementi unici: " + sommaUnici);
        System.out.println("------------------------------------------");
        //* Given a list of Strings : ["as", "123", "32", "2as"],
        // * Create another list that contains only integers.
        // * The output should be: [123,32]
        //* Remove duplicates from an arrayList.
        List<String> listaStringhe= Arrays.asList(
                "as", "123", "32", "2as"
        );
        List<Integer> numeriLista = listaStringhe.stream()
        .filter(s->s.matches("\\d+"))
                .map(Integer::parseInt)
                        .collect(Collectors.toList());
        System.out.println(numeriLista);
        System.out.println("------------------------------------------");


    }

    //2
    interface Operazione {
        int calcola(int a, int b);
    }
}

