package linkedlist;

import java.util.Scanner;
import java.util.LinkedList;

public class ContarNumeroEscolhido {

    /*
    1 - Preencher Linkedlist com inteiros ate digitar zero
    2 - Imprimir lista original na tela
    3 - Solicitar um numero ao usuario
    4 - Imprimir na tela o numero de vezes que esse numero aparece na lista
     */

    private static Scanner entrada = new Scanner(System.in);

    public static void main (String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();

        preencher(lista);
        imprimir(lista);
        verificarNumero(lista);
    }

    private static void preencher(LinkedList<Integer> lista) {
        int num;

        do {
            System.out.println("Insira um número para adicionar na lista: ");
            num = entrada.nextInt();
            entrada.nextLine();

            if (num != 0) {
                lista.add(num);
            }

        } while (num != 0);
    }

    private static void imprimir(LinkedList<Integer> lista) {
        for (int num : lista) {
            System.out.print( num + " | ");
        }
        System.out.println();
    }

    private static void verificarNumero(LinkedList<Integer> lista) {
        int numero;
        int contador = 0;

        System.out.println("Insira um número que deseja verificar quantas vezes aparece na lista:");
        numero = entrada.nextInt();
        entrada.nextLine();

        for (int num : lista) {
            if (num == numero) {
                contador++;
            }
        }

        System.out.println("O número " + numero + " aparece " + contador + " vez(es) na lista.");
    }
}
