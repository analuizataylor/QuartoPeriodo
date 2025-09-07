package pilha;

import entidades.PilhaInt;
import java.util.Scanner;

public class MostrarElementosRemovidos {

    /*
    1 - Preencher pilha ate inserir zero
    2 - Imprimir elemento do topo da pilha
    3 - Remover todos os elementos da pilha
    4 - Imprimir todos os elementos removidos da pilha
     */

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        PilhaInt pilha = new PilhaInt();

        preencher(pilha);

        if (!pilha.isEmpty()) {
            System.out.println("Elemento do topo: " + pilha.top());
        }

        removerElementos(pilha);
    }

    // Preenche a pilha até o usuário digitar 0
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

    // Remove todos os elementos e imprime os que foram removidos
    private static void removerElementos(PilhaInt pilha) {
        System.out.println("Elementos removidos da pilha:");

        while (!pilha.isEmpty()) {
            int removido = pilha.pop();
            System.out.print(removido + " | ");
        }
        System.out.println(); // quebra de linha final
    }
}
