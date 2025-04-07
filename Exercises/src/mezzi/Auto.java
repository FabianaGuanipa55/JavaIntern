package mezzi;

public class Auto extends Mezzi {
    int numeroDiPorte;

    public Auto(int numeroDiPorte, String modello, int velocita){
        super(modello, velocita);
        this.numeroDiPorte=numeroDiPorte;
    }

    public int getNumeroDiPorte() {
        return numeroDiPorte;
    }

    public void setNumeroDiPorte(int numeroDiPorte) {
        this.numeroDiPorte = numeroDiPorte;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numero di porte=" + numeroDiPorte + '\'' +
                "modello='" + modello + '\'' +
                "velocita'" + velocita + "Km/h" + '\'' +
                '}';
    }

    @Override
    public void informazioniDelMezzo() {

    }
}
