package cf;

public class Main {
    public static void main(String[] args) {
        Cittadino c1 = new Cittadino("Mario", "Rossi", "RSSMRA85M01H501U");
        c1.validaCodiceFiscale();

        Cittadino c2 = new Cittadino("Gennaro", "Verdi", "ABC123");
        c2.validaCodiceFiscale();

        Cittadino c3 = new Cittadino("Nicola","Neri", "ABCDEF7JLOPQYWYP");
        c3.validaCodiceFiscale();
    }
}
