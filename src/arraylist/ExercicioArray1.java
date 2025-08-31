package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 2 - criar ArrayList
 * 3 - Preencher arrayList e para quando digitar zero
 * 4 - Imprimir na tela
 * 5 - remover pares
 * 6 - mostrar na tela
 */

public class ExercicioArray1 {
        private static Scanner entrada  = new Scanner(System.in);
        public static void main(String[] args) {

            // INSTANCIAR ARRAYLIST
            ArrayList<Integer> lista = new ArrayList<>();

            // CHAMAR METODOS
            preencher (lista);
            imprimir(lista);
            removerPar (lista);
            imprimir(lista);
        }

        public static void preencher(ArrayList<Integer> lista) {
            int num;

            do {
                System.out.println("Insira um inteiro ou ZERO para terminar: ");
                num = entrada.nextInt();
                entrada.nextLine();

                // SO VAI INSERIR NA LISTA SE A OPCAO FOR DIFERENTE DE ZERO
                if (num != 0) {
                    lista.add(num);
                }
            } while (num != 0);
        }

        public static void removerPar (ArrayList<Integer> lista) {
            lista.removeIf (num -> num % 2 == 0);
        }


        /* OUTRO METODO DE REMOCAO DE ARRAYLIST
        public static void removerPar (ArrayList<Integer> lista) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) % 2 == 0) {
                    lista.remove(i);
                    i--;
                }
            }
        }
        */

        public static void imprimir (ArrayList<Integer> lista) {
            // imprimir a lista em um formato diferente
            // sintaxe desse for: (tipo  variavel : nome_da_lista)

            for (int num : lista) {
                System.out.print( num + " | ");
            }
            System.out.println();
        }
}
