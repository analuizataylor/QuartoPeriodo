package hashtreeset;
import java.util.*;

public class LoteriaTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> numeros = sorteiaNumeros(10);
        System.out.println("10 NUMEROS");
        imprime (numeros);

        System.out.println("50 NUMEROS");
        numeros = sorteiaNumeros(50);

        // Como acessar um elemento especifico?
        // usando vetor
        Object[] vetor = new Object[50];
        vetor = numeros.toArray();
        System.out.println("posicao 5 " +vetor[5]);

        // ou usando ArrayList
        ArrayList<Integer> array = new ArrayList<Integer>(numeros);
        System.out.println("posicao 5 " + array.get(5));
        imprime (numeros);
    }

    public static TreeSet<Integer> sorteiaNumeros(int quant) {
        TreeSet<Integer> numeros = new TreeSet<Integer>();
        int num;

        while (numeros.size() < quant) {
            num = (int) (100 * Math.random()+1);
            numeros.add(num);
        }
        return numeros;
    }

    public static void imprime (TreeSet<Integer> numeros) {
        //Com a classe Set (HashSet e TreeSet), nao e possivel
        // usar o for normal pq nao se consegue acessar um elemento
        // de uma determinada posicao, p. ex., nao existe o metodo
        // get(pos), nem e possivel remover um objeto de uma posicao
        // nao existe remove (pos).

        for (int i : numeros) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
}

