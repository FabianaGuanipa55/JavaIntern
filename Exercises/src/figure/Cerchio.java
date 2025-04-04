package figure;

public class Cerchio extends figuraGeometrica{
    private double raggio;
    public Cerchio(double raggio){
        this.raggio=raggio;
    }

    @Override
    public double calcolaArea() {
        return this.raggio*this.raggio*Math.PI;
    }

    @Override
    public String toString() { //non avevo messo il toString e nel terminal usciva figure.Cerchio@1b6d3586
        return "Cerchio{" +
                "raggio=" + raggio +
                '}';
    }
}
