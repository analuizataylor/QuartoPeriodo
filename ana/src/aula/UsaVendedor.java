package aula;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaVendedor {
	/*
	 * Usando a classe Vendedor, faça um aplicativo para:
	 * 1 - criar cinco vendedores e armazenar em um ArrayList
	 * 2 - mostre na tela os vendedores com maior tempo de serviço
	 * 3 - moste na tela o nome e a categoria e o salário de todos os vendedores
	 * 4 - altere o salário base para 2500,00
	 * 5 - Mostre na tela o nome, a categoria e o salário de todos os vendedores.
	 * 6 - calcule e exiba o total geral de todas as vendas.
	 * 7 - pedir o nome de um vendedor e removê-lo da lista. 
	 */

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Vendedor> cad = new ArrayList<Vendedor>();
		
		cadastrar(cad);
		mostrarMaiorTempo (cad);
		mostrarVend (cad);
		Vendedor.setSalarioBase(2500);
		mostrarVend (cad);
		totalVendas(cad);
		remover(cad);

	}
	private static void cadastrar(ArrayList<Vendedor> cad) {
		cad.add(new Vendedor("Cinthia", 65, 123123));
		cad.add(new Vendedor("Ana", 35, 112233));
		cad.add(new Vendedor("Rui", 10, 232323));
		cad.add(new Vendedor("Tiago", 65, 221133));
		cad.add(new Vendedor("Maria"));
		
	}
	private static void mostrarMaiorTempo(ArrayList<Vendedor> cad) {
		// achar qual é o maior tempo
		int maior = maiorTempo(cad);
		// achar todos os vendedores que tem esse tempo
		System.out.println("MAIOR TEMPO DE SERVICO = "+maior);
		for (Vendedor v: cad) {
			if (v.getTempoServ()==maior) {
				System.out.println(v.getNome());
			}
		}
		
	}
	
	private static int maiorTempo(ArrayList<Vendedor> cad) {
		int maior = cad.get(0).getTempoServ();
		for (int i=1; i<cad.size(); i++) {
			if (cad.get(i).getTempoServ() > maior) {
				maior = cad.get(i).getTempoServ();
			}
		}
		return maior;
	}
	private static void mostrarVend(ArrayList<Vendedor> cad) {
		for (Vendedor i : cad) {
			System.out.println("Nome: " + i.getNome() + "Categoria: " + i.getCategoria() + "Salario: " + i.getSalarioBase());
		}
	}

	private static void totalVendas(ArrayList<Vendedor> cad) {
		double total = 0;
		for (Vendedor vendedor : cad) {
			//i.getTotalVendas();
			total += vendedor.getTotalVendas();
		}
		System.out.println("Total de todas as vendas: " + total);
		
		
	}
	private static void remover(ArrayList<Vendedor> cad) {
		System.out.println("Insira o nome para remover: ");
		String nome = scan.nextLine();
		
		for (Vendedor vendedor : cad) {
			if (nome.equalsIgnoreCase(vendedor.getNome())) {
				cad.remove(vendedor);
				System.out.println("Removido com sucesso");
				return;
			}
		} System.err.println(nome + " Não encontrado");
		
	}
}

