package linkedlist;
import java.util.LinkedList;

/*
 * 1 - Preencher um LinkedList com 10 inteiros
 * 2 - Imprimir na tela todos os numeros
 * 3 - Remover o elemento da posicao 0
 * 4 - Imprimir na tela
 * 5 - Trocar o elemento da posicao 4 por 100
 * 6 - Preencher outro LinkedList com 5 numeros
 * 7 - juntar as duas listas
 * 8 - imprimir na tela
 */

public class PrimeiroLinkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();
        LinkedList<Integer> uniao;

        preencher (lista1, 10);
        System.out.println(lista1);

        int num2 = lista1.remove(0);
        System.out.println("removeu   "+num2);
        System.out.println(lista1);

        lista1.set(4, 100);
        System.out.println(lista1);

        preencher (lista2, 5);
        System.out.println(lista2);

        // Instancia a lista3 e coloca nela todos os elementos da lista 1
        uniao = new LinkedList<>(lista1);

        // Adiciona ao final da lista3, todos os elementos da lista 2
        uniao.addAll(lista2);

        System.out.println("LISTAS FINAIS");
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(uniao);

    }

    private static void preencher(LinkedList<Integer> lista, int quant) {
        int num;
        for (int i=0; i<quant; i++) {
            num = (int)(Math.random()*50+1);
            lista.add(num);
        }
    }

}
