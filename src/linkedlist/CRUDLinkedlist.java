package linkedlist;
import java.util.LinkedList;

public class CRUDLinkedlist {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        // CREATE
        lista.add("Ana");
        lista.add("João");
        lista.addFirst("Maria"); // adiciona no início
        lista.addLast("Carlos"); // adiciona no fim

        // READ
        System.out.println(lista.get(0)); // primeiro
        for( String nome :lista) {
            System.out.println(nome);
        }

        // UPDATE
        lista.set(1,"João Pedro"); // altera posição 1

        // DELETE
        lista.remove("Ana"); // remove pelo valor
        lista.remove(0); // remove pelo índice
    }
}
