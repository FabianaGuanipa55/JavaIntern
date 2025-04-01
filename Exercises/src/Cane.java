public class Cane implements Mammifero, AgeCluster{
    private int eta;
    public Cane(int eta){
        this.eta= eta;
    }
    @Override
    public void faiVerso(){
        System.out.println("Bau");
    }
    @Override
    public void corri(){
        System.out.println("Il cane corre");
    }
    @Override
    public void chiediCibo(){
        for(int i=0; i<3; i++){
            faiVerso();
        }
        System.out.println("Dammi cibo per cani: " + getAgeCluster(eta));
    }
}
