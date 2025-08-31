package arraylist;
import java.util.ArrayList;

/*
 * 1 - Preencher um ArrayList com 10 inteiros
 * 2 - Imprimir na tela todos os numeros
 * 3 - Remover o elemento da posicao 0
 * 4 - Imprimir na tela
 * 5 - Trocar o elemento da posicao 4 por 100
 * 6 - Preencher outro ArrayList com 5 numeros
 * 7 - juntar as duas listas
 * 8 - imprimir na tela
 *
 */

public class PrimeiroArraylist {

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>(); // 10 posicoes
        ArrayList<Integer> lista2 = new ArrayList<>(5);
        ArrayList<Integer> uniao;

        preencher (lista1, 10);
        System.out.println(lista1);

        int num2 = lista1.remove(0);
        System.out.println("removeu   " + num2);
        System.out.println(lista1);

        lista1.set(4, 100);
        System.out.println(lista1);

        preencher (lista2, 5);
        System.out.println(lista2);

        // Instancia a lista3 e coloca nela todos os elementos da lista 1
        uniao = new ArrayList<>(lista1);

        // Adiciona ao final da lista3, todos os elementos da lista 2
        uniao.addAll(lista2);

        System.out.println("LISTAS FINAIS");
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(uniao);

    }

    private static void preencher(ArrayList<Integer> lista, int quant) {
        int num;
        for (int i = 0; i < quant; i++) {
            num = (int)(Math.random()*50+1);
            lista.add(num);
        }
    }

}
