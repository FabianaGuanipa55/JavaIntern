package lambda;
//8.
//Hai una classe:
//class Persona {
//    String nome;
//    int eta;
//    // costruttore + getter
//}

//Hai una lista di persone. Ordina:
//Prima per età (crescente)
//Poi, a parità di età, in ordine alfabetico sul nome
//Usa una lambda come comparatore

import java.util.*;
import java.util.stream.Collectors;

//9.
//Hai una lista di persone:
//List<Persona> persone = Arrays.asList(
//    new Persona("Mario", 30),
//    new Persona("Luca", 20),
//    new Persona("Anna", 20),
//    new Persona("Giulia", 30)
//);
//Raggruppa le persone in una Map<Integer, List<Persona>> dove la chiave è l’età e il valore la lista di persone con quell’età (Collectors.groupingBy).
//Extra -  puoi usare solo Stream e/o lambda(se necessario) e non cicli normali:
public class Persona {
    String nome;
    int eta;
    public Persona(String nome, int eta){
        this.nome= nome;
        this.eta= eta;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    @Override
    public String toString() {
        return "Persona " +
                "Nome: " + nome +
                " Eta: " + eta;
    }

public static void main (String [] args){
    List<Persona> persone = Arrays.asList(
    new Persona("Mario", 30),
    new Persona("Luca", 20),
    new Persona("Anna", 20),
    new Persona("Giulia", 30)
);
    persone.sort(Comparator.comparing(Persona::getEta))
            .thenComparing(Persona::getNome);
    persone.forEach(System.out::println);

    Map<Integer, List<Persona>> ragruppa = persone.stream()
            .collect(Collectors.groupingBy(Persona::getEta));
            System.out.println(ragruppa);
}
}
