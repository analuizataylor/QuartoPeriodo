package aula;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Programa que preenche uma fila.
 * Imprima na tela.
 * Retire os elementos pares da fila.
 * Imprima novamente na tela.
 * Use a classe FilaInt
 * 
 * 
 * 
 * APLICACOES COM ARRAY LINKED TREESET PILHA E FILA 
 */

public class execiciofila {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main (String[] args) {
		FilaInt fila = new FilaInt();
		
		preencher(fila);
		imprimir(fila);
		fila = removerPares(fila);
		imprimir(fila);
	}
	
	private static void preencher(FilaInt fila) {
		System.out.println("Insira a quantidade de elementos: ");
		int quant = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < quant; i++ ) {
			System.out.println("Insira o elemento " + i+1 + " : ");
			int num = scan.nextInt();
			fila.enqueue(num);
		}
		System.out.println("Fila: " + fila.toString());
		
	}
	private static FilaInt removerPares(FilaInt fila) {
		int tam = fila.size();
		
		for (int i = 0; i < tam; i++) {
			if (fila.peek() % 2 != 0) {
				fila.enqueue(fila.dequeue());
			}
			else {
				fila.dequeue();
			}
		}
		return fila;

	}
	private static void imprimir(FilaInt fila) {
		// TODO Auto-generated method stub
		
	}

}
