package array;

public class Main {
    public static void main(String[] args) {
        Ordinatore ord = new Ordinatore();
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Array prima: ");
        ord.stampaArray(array);

        ord.ordinaDecrescente(array);

        System.out.println("Array dopo: ");
        ord.stampaArray(array);
    }
}
