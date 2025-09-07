package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoverPares {

    /*
    1 - Preencher Arraylist com inteiros (parar quando digitar zero)
    2 - Imprimir lista original na tela
    3 - Remover numeros pares da lista
    4 - Imprimir lista final na tela
     */

    private static Scanner entrada = new Scanner(System.in);

    public static void main (String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        preencher(lista);
        imprimir(lista);
        removerPares(lista);
        imprimir(lista);

    }

    private static void preencher(ArrayList<Integer> lista) {
        int num;

        do{
            System.out.println("Insira um número para inserir na lista: ");
            num = entrada.nextInt();
            entrada.nextLine();

            if (num != 0) {
                lista.add(num);
            }

        } while (num != 0);
    }

    private static void removerPares(ArrayList<Integer> lista) {
        lista.removeIf(num -> num % 2 == 0);
    }

    /*
        for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) % 2 == 0) {
                    lista.remove(i);
                    i--;
                }
            }
     */

    private static void imprimir(ArrayList<Integer> lista) {
        for (int num : lista) {
            System.out.print( num + " | ");
        }
        System.out.println();
    }
}

