public class Tartaruga implements Rettile, AgeCluster{
    private int eta;
    public Tartaruga(int eta){
        this.eta= eta;
    }
    @Override
    public void faiVerso(){
        System.out.println("splash");
    }
    @Override
    public void corri(){
        System.out.println("La tartaruga nuota velocemente");
    }
    @Override
    public void chiediCibo(){
        for(int i=0; i<3; i++){
            faiVerso();

        }
        System.out.println("Dammi cibo per tararughe:" + getAgeCluster(eta));
    }
}
