public class Gatto implements Mammifero, AgeCluster{
    private int eta;
    public Gatto(int eta){
        this.eta= eta;
    }
    @Override
    public void faiVerso(){
        System.out.println("Miao");
    }
    @Override
    public void corri(){
        System.out.println("Il gatto corre");
    }
    @Override
    public void chiediCibo(){
        for(int i=0; i<3; i++){
            faiVerso();
        }
        System.out.println("Dammi cibo per gatti: " + getAgeCluster(eta));
    }
}
