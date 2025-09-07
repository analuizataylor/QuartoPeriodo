package pilha;

import entidades.PilhaInt;
import java.util.Scanner;

public class RetirarNumerosIguais {

    /*
    1 - Preencher inteiros ate digitar zero
    2 - Imprimir pilha inicial
    3 - Retirar todos os numeros iguais da pilha
    4 - Imprimir pilha sem numeros iguais
     */

    private static Scanner entrada = new Scanner(System.in);

    public static void main (String[] args) {

        PilhaInt pilha = new PilhaInt();

        preencher(pilha);
        System.out.println("Pilha inicial:");
        imprimir(pilha);
        removerElementosIguais(pilha);
        System.out.println("Pilha sem elementos repetidos:");
        imprimir(pilha);
    }

    private static void preencher(PilhaInt pilha) {
        int num;

        do {
            System.out.println("Insira um número para adicionar na pilha: ");
            num = entrada.nextInt();
            entrada.nextLine();

            if (num != 0) {
                pilha.push(num);
            }

        } while (num != 0);
    }

    private static void removerElementosIguais(PilhaInt pilha) {
        PilhaInt pilhaAux = new PilhaInt();
        PilhaInt pilhaTemp = new PilhaInt();

        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            boolean jaExiste = false;

            // verificar se o valor já está em pilhaAux
            while (!pilhaAux.isEmpty()) {
                int v = pilhaAux.pop();
                if (v == valor) {
                    jaExiste = true;
                }
                pilhaTemp.push(v);
            }

            // devolver os elementos para pilhaAux
            while (!pilhaTemp.isEmpty()) {
                pilhaAux.push(pilhaTemp.pop());
            }

            // se não existia ainda, adiciona
            if (!jaExiste) {
                pilhaAux.push(valor);
            }
        }

        // devolve da pilhaAux para a pilha original
        while (!pilhaAux.isEmpty()) {
            pilha.push(pilhaAux.pop());
        }
    }

    private static void imprimir(PilhaInt pilha) {
        PilhaInt copia = new PilhaInt();

        while (!pilha.isEmpty()) {
            int elemento = pilha.pop();
            System.out.print(elemento + " | ");
            copia.push(elemento);

        }

        while (!copia.isEmpty()) {
            pilha.push(copia.pop());
        }
    }
}
