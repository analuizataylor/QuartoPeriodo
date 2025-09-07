package arraylist;
import java.util.ArrayList;

public class CRUDArraylist {

    public static void main (String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        // CREATE
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // READ
        System.out.println(numeros.get(1)); // posição 1 = 20
        for (int n : numeros) {
            System.out.println(n);
        }

        // UPDATE
        numeros.set(1, 25); // muda o valor da posição 1 para 25

        // DELETE
        numeros.remove(0); // remove posição 0
        numeros.remove(Integer.valueOf(25)); // remove pelo valor

    }

}
