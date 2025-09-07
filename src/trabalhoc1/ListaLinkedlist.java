package trabalhoc1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListaLinkedlist {

    public static void main(String[] args) {

        // INSTANCIA A LISTA
        List<Integer> lista1 = new LinkedList<>();

        // PREENCHE A LISTA COM 20 NUMEROS INTEIROS RANDOM
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            lista1.add(random.nextInt(10));
        }

        // IMPRIME OS ELEMENTOS DA LISTA
        System.out.println("Lista 1: " + lista1);

        // INSTANCIA A SEGUNDA LISTA
        List<Integer> lista2 = new LinkedList<>();

        // REMOVE AS DUPLICACOES
        for (Integer numero : lista1) {
            if (!lista2.contains(numero)) {
                lista2.add(numero);
            }
        }

        // ORDENA A LISTA 2 (Bubble Sort)
        for (int i = 0; i < lista2.size() - 1; i++) {

            for (int j = 0; j < lista2.size() - i - 1; j++) {

                if (lista2.get(j) > lista2.get(j + 1)) {
                    int temp = lista2.get(j);
                    lista2.set(j, lista2.get(j + 1));
                    lista2.set(j + 1, temp);
                }
            }
        }

        // INVERTE A SEGUNDA METADE DA LISTA
        int meio = lista2.size() / 2;
        int fim = lista2.size() - 1;

        for (int i = meio; i < (meio + fim) / 2 + 1; i++) {
            int temp = lista2.get(i);
            lista2.set(i, lista2.get(fim - (i - meio)));
            lista2.set(fim - (i - meio), temp);
        }

        System.out.println("Lista 2: " + lista2);
    }
}
