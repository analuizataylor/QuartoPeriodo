package conjuntos;
import java.util.*;

public class LoteriaHashSet {

    public static void main(String[] args) {
        HashSet<Integer> numeros = sorteiaNumeros(10);

        System.out.println("10 NUMEROS");
        imprime (numeros);

        System.out.println("40 NUMEROS");
        numeros = sorteiaNumeros(40);

        imprime (numeros);
    }

    public static HashSet<Integer> sorteiaNumeros(int quant) {
        // Usando HashSet que nao ordena os elementos do conjunto
        HashSet<Integer> numeros = new HashSet<Integer>();
        int num;

        while (numeros.size() < quant) {
            num = (int) (100 * Math.random()+1);
            numeros.add(num);
        }
        return numeros;
    }

    public static void imprime (HashSet<Integer> numeros) {
        //Com a classe Set (HashSet e TreeSet), nao e possivel
        // usar o for normal pq nao se consegue acessar um elemento
        // de uma determinada posicao, p. ex., nao existe o metodo
        // get(pos), nem e possivel remover um objeto de uma posicao
        // nao existe remove (pos)

        for (int i : numeros){
            System.out.print( i + "  ");
        }
        System.out.println();
    }
}

