package figure;

public class Quadrato extends figuraGeometrica {
    private double lato;
    public Quadrato(double lato){
        this.lato=lato;
    }

    @Override
    public double calcolaArea() {
        return this.lato*this.lato;
    }

    @Override
    public String toString() {
        return "Quadrato{" +
                "lato=" + lato +
                '}';
    }
}
