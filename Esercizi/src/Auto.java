public class Auto implements Movimento {
@Override
    public void spostati(){
    System.out.println("L'auto si sta spostado");
}
public static void main (String []arsg){
    Auto ilMioAuto= new Auto();
    ilMioAuto.spostati();
}
}
