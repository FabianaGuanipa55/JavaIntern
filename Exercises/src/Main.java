public class Main {
    public static void main(String[] args){
        Cane cane=new Cane(3);
        Gatto gatto= new Gatto(11);
        Tartaruga tartaruga= new Tartaruga(49);
        cane.chiediCibo();
        gatto.chiediCibo();
        tartaruga.chiediCibo();
    }
}
