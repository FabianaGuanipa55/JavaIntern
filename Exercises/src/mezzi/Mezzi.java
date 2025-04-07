package mezzi;

public class Mezzi {
    String modello;
    int velocita;

    public Mezzi(String modello, int velocita) {
        this.modello=modello;
        this.velocita=velocita;
    }
    void informazioniDelMezzo (){
        System.out.println("Modello: " + modello + "Velocita" + velocita + "Km");
    }
}
