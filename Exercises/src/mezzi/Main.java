package mezzi;

public class Main {
    public static void main(String[]args){
        Auto mioAuto=new Auto(5, "Tesla",150);
        Bicicletta bici= new Bicicletta("a basso consumo", "Tesla",30);
        bici.informazioniDelMezzo();
        mioAuto.informazioniDelMezzo();
        System.out.println(mioAuto);
        System.out.println(bici);

    }
}
