package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stringhe {
public static void main(String[]args){
    //2.	Scrivi un programma Java usando una Lambda Expression per convertire una lista di stringhe tutta in maiuscolo e minuscolo
    List<String> listaParole = Arrays.asList("EI, sono FRAgola OttanTAsei E sono DI POmpei");
    listaParole.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    listaParole.stream()
            .map(String::toLowerCase)
            .forEach(System.out::println);
    System.out.println("-----------------------------------------");
    //5.	Scrivi un programma Java usando una Lambda Expression per verificare se una stringa è vuota
    Predicate<String> isEmpty = s -> s.isEmpty();
    System.out.println(isEmpty.test (""));
    System.out.println(isEmpty.test ("Parole parole"));
    System.out.println("-----------------------------------------");
    //8.	Scrivi un programma Java usando una Lambda Expression per ordinare alfabeticamente una lista di stringhe
    //!!!! lista di stringhe separate: "Mela", "Banana", "Pera", "Fragola", "Pesca", "Ananas", "Uva", "Ciliegie", "Mandarini" | questa è un'unica stringa: "Mela, Banana, Pera, Fragola, Pesca, Ananas, Uva, Ciliegie, Mandarini"
    List<String> listaOrdinata = Arrays.asList(
            "Mela", "Banana", "Pera", "Fragola", "Pesca", "Ananas", "Uva", "Ciliegie", "Mandarini"
    );
    listaOrdinata.stream()
            .sorted()
            .forEach(System.out::println);
    System.out.println("-----------------------------------------");
    //12.	Scrivi un programma Java usando una Lambda Expression per concatenare due stringhe
    ConcatenaStringhe unisci = (a, b) -> a + b;
    String output = unisci.concatena("Ciao", " Mondo");
    System.out.println(output);
    System.out.println("-----------------------------------------");
    //17.	Scrivi un programma Java usando una Lambda Expression per verificare se una stringa è un palindromo (uguale letta da sinistra a destra e da destra a sinistra), ignorando spazi e maiuscole/minuscole
    Predicate<String> isPalindroma = s -> {
        String spazi = s.replaceAll("\\s+", "").toLowerCase();
        String inverti = new StringBuilder(spazi).reverse().toString();
        return spazi.equals(inverti);
    };
    System.out.println(isPalindroma.test ("An Na"));
    System.out.println(isPalindroma.test ("Anna"));
    System.out.println(isPalindroma.test ("Fabiana"));
    System.out.println("-----------------------------------------");
    //18.	Scrivi un programma Java usando una Lambda Expression per ordinare le stringhe in base alla loro lunghezza in ordine crescente
    //19.	Scrivi un programma Java usando una Lambda Expression per trovare la stringa con lunghezza massima in una lista di stringhe
    //20.	Scrivi un programma Java usando una Lambda Expression per trovare la stringa con lunghezza minima in una lista di stringhe
    //21.	Scrivi un programma Java usando una Lambda Expression per convertire una lista di stringhe in maiuscolo
    //22.	Scrivi un programma Java usando una Lambda Expression per filtrare tutte le stringhe di una lista che hanno lunghezza maggiore di 5 caratteri
    List<String> listaParoleOrdinata = Arrays.asList(
            "Uva",
            "Media",
            "Lunghissima",
            "Tv",
            "Sole"
    );
    listaParoleOrdinata.stream()
            .sorted(Comparator.comparing(String::length))
            .forEach(System.out::println);
    System.out.println("------------19----------------------------");
    String max = listaParoleOrdinata.stream()
            .max(Comparator.comparing(String::length)).orElse("");
    System.out.println(max);
    System.out.println("------------20----------------------------");
    String min = listaParoleOrdinata.stream()
            .min(Comparator.comparing(String::length)).orElse("");
    System.out.println(min);
    System.out.println("------------21----------------------------");
    listaParoleOrdinata.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    System.out.println("------------22----------------------------");
    listaParoleOrdinata.stream()
            .filter(s -> s.length()>=5)
            .forEach(System.out::println);
    System.out.println("-----------------------------------------");
    //23.	Scrivi un programma Java usando una Lambda Expression per convertire una lista di numeri interi nelle rispettiva versione scritta come stringa
    List<Integer> numeriInStringa = Arrays.asList(
            1,
            2,
            3,
            4,
            5
    );
    numeriInStringa.stream()
            .map(String::valueOf)
            .forEach(System.out::println);
    System.out.println("-----------------------------------------");
    //25.	Scrivi un programma Java usando una Lambda Expression per contare il numero di parole in una frase data (le parole sono separate da spazi)
    Function<String,Long> contaParole = frase->
            Arrays.stream(frase.trim().split("\\s+")).count();
    System.out.println(contaParole.apply("i topi non avevano nipoti"));
    System.out.println("-----------------------------------------");
    //26.	Scrivi un programma Java usando una Lambda Expression per convertire una lista di stringhe in maiuscolo se la lunghezza è pari e in minuscolo se la lunghezza è dispari
    //29.	Scrivi un programma Java usando una Lambda Expression per rimuovere le vocali da una lista di stringhe
    List<String> listaStringhe = Arrays.asList(
            "Ciao",
            "Sole",
            "Schermo",
            "Libro"
    );
    listaStringhe.stream()
            .filter(s -> s.length()%2==0)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    listaStringhe.stream()
            .filter(s -> s.length()%2!=0)
            .map(String::toLowerCase)
            .forEach(System.out::println);
    System.out.println("-----------29----------------------------");
    listaStringhe.stream()
            .map(s -> s.replaceAll("[aeiouAEIOU]","*"))
            .forEach(System.out::println);
    System.out.println("-----------------------------------------");
    //36.	Scrivi un programma Java usando una Lambda Expression per trovare la prima stringa non vuota in una lista di stringhe
    List<String> listaPiena = Arrays.asList(
            "",
            "",
            "Mario",
            "",
            "Rossi"
    );
    String nonVuota = listaPiena.stream()
            .filter(s->! s.isEmpty())
            .findFirst().orElse("");
    System.out.println(nonVuota);
    System.out.println("-----------------------------------------");
    //37.	Scrivi un programma Java usando una Lambda Expression per trovare la stringa palindroma più lunga in una lista di stringhe
    List<String> listaParolePalindrome = Arrays.asList(
      "anna",
      "oro",
            "radar",
            "sos",
            "onorarono"
    );
    String piuLunga = listaParolePalindrome.stream()
            .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
            .max(Comparator.comparing(String::length)).orElse("");
    System.out.println("La parola più lunga è: " + piuLunga);
    System.out.println("-----------------------------------------");
    //39.	Scrivi un programma Java usando una Lambda Expression per verificare se tutte le stringhe in una lista iniziano con una lettera
    List<String> parole = Arrays.asList(
            "albero",
            "casa",
            "123via",
            "cane",
            "#hashtag",
            "",
            "sole"
    );

    boolean tutteInizianoConLettera = parole.stream()
            .filter(s -> !s.isEmpty())
            .allMatch(s -> Character.isLetter(s.charAt(0)));

    System.out.println("tutte iniziano con una lettera? " + tutteInizianoConLettera);
    System.out.println("-----------------------------------------");

//43.	Scrivi un programma Java usando una Lambda Expression per verificare se tutte le stringhe in una lista iniziano con la lettera 'S'
    List<String> paroleConLettera = Arrays.asList(
            "sole",
            "saluto",
            "scuola",
            //"mare",
            "sedia"
    );
    boolean inizianoConS = paroleConLettera.stream()
            .allMatch(s->s.startsWith("s"));
    System.out.println("tutte iniziano con una lettera S? " + inizianoConS);
    System.out.println("-----------------------------------------");

}
    //12
    interface ConcatenaStringhe{
       String concatena(String a, String b);
    }
}



