package lavoro;

public class Operaio extends Dipendente{
    @Override
    public String toString() {
        return "Operaio: "+ calcolaStripendio();
    }

    @Override
    public double calcolaStripendio() {
    return 13.50;
    }
}