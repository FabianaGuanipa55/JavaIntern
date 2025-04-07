package lavoro;

public class Manager extends Dipendente{
    @Override
    public double calcolaStripendio() {
        return 10.50;
    }

    @Override
    public String toString() {
        return "Manager: "+ calcolaStripendio();
    }
}
