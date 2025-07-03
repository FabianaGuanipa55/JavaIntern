//Simulazione semaforo Crea una classe Semaforo con metodo:
//· simula(int cicli): per un certo numero di cicli stampa in sequenza "VERDE 30s", "GIALLO 5s" e "ROSSO 40s" usando un ciclo
package trafficLights;

public class Semaforo {
public void simula(int cicli){
    for(int ciclo = 1; ciclo <= cicli; ciclo ++){
        for(int i=1; i<= 30; i++ ){
        }
        System.out.println("Verde 30s");
        for(int i=1; i<= 5; i++){
        }
        System.out.println("Giallo 5s");
        for(int i=1; i<= 40; i++){
        }
        System.out.println("Rosso 40s");
    }
}
}
