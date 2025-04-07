package mezzi;

public class Bicicletta extends Mezzi {
    String motoreElettrico;

    public Bicicletta(String motoreElettrico, String modello, int velocita){
        super(modello, velocita);
        this.motoreElettrico=motoreElettrico;
    }

    public String getMotoreElettrico() {
        return motoreElettrico;
    }

    public void setMotoreElettrico(String motoreElettrico) {
        this.motoreElettrico = motoreElettrico;
    }

    @Override
    public String toString() {
        return "Bicicletta{" +
                "motore elettrico='" + motoreElettrico + '\'' +
                "modello='" + modello + '\'' +
                "velocita'" + velocita + "Km/h" + '\'' +

                '}';
    }
    @Override
    public void informazioniDelMezzo() {

    }
}
