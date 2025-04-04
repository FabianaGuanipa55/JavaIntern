package figure;

public class Rettangolo extends figuraGeometrica {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    @Override
    public double calcolaArea() {
        return this.base*this.altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
