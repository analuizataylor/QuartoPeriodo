package atributoclasse;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaVendedor {

    /*
     * Usando a classe Vendedor, faça um aplicativo para:
     *
     * 1 - criar cinco vendedores e armazenar em um ArrayList
     * 2 - mostre na tela os vendedores com maior tempo de serviço
     * 3 - moste na tela o nome e a categoria e o salário de todos os vendedores
     * 4 - altere o salário base para 2500,00
     * 5 - Mostre na tela o nome, a categoria e o salário de todos os vendedores.
     * 6 - calcule e exiba o total geral de todas as vendas.
     * 7 - pedir o nome de um vendedor e removê-lo da lista.
     */

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

        cadastrar(vendedores);
        mostrarMaiorTempo(vendedores);
        mostrarVend(vendedores);
        Vendedor.setSalarioBase(2500);
        mostrarVend(vendedores);
        totalVendas(vendedores);
        remover(vendedores);
    }

    private static void cadastrar(ArrayList<Vendedor> vendedores) {
        vendedores.add(new Vendedor("Cinthia", 65, 123123));
        vendedores.add(new Vendedor("Ana", 35, 112233));
        vendedores.add(new Vendedor("Rui", 10, 232323));
        vendedores.add(new Vendedor("Tiago", 65, 221133));
        vendedores.add(new Vendedor("Maria"));
    }

    private static void mostrarMaiorTempo(ArrayList<Vendedor> vendedores) {

        // ACHAR QUAL O MAIOR TEMPO
        int maior = maiorTempo(vendedores);

        // ACHAR TODOS OS VENDEDORES COM ESSE MAIOR TEMPO
        System.out.println("Maior tempo de serviço: " + maior);
        for (Vendedor v : vendedores) {
            if (v.getTempoServ() == maior) {
                System.out.println(v.getNome());
            }
        }

    }

    private static int maiorTempo(ArrayList<Vendedor> vendedores) {

        int maior = vendedores.get(0).getTempoServ();

        for (int i = 1; i < vendedores.size(); i++) {

            if (vendedores.get(i).getTempoServ() > maior) {
                maior = vendedores.get(i).getTempoServ();
            }
        }
        return maior;
    }

    private static void mostrarVend(ArrayList<Vendedor> vendedores) {

        for (Vendedor v : vendedores) {
            System.out.println("Nome: " + v.getNome() + " Categoria: " + v.getCategoria() + " Salário: " + v.salario());
        }

    }

    private static void totalVendas(ArrayList<Vendedor> vendedores) {
        double total = 0;

        for (Vendedor v : vendedores) {
            total += v.getTotalVendas();
        }
        System.out.println("O total de vendas é de: R$" + total);

    }

    private static void remover(ArrayList<Vendedor> vendedores) {

        System.out.println("Insira um nome para remover: ");
        String nomeRemover = entrada.nextLine();

        for (Vendedor v : vendedores) {
            if (v.getNome().equalsIgnoreCase(nomeRemover)) {
                vendedores.remove(v.getNome());
            }
        }

    }
}

