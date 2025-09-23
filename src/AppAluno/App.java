package AppAluno;
//import java.util.Scanner;
import java.util.ArrayList;

/*
 Uma classe App para testar as classes feitas nos exemplos que:
 -> Crie um ArrayList de Pessoa
 -> Cadastre dois objetos da classe Pessoa e dois da classe Aluno na ArrayList
 -> Mostre na tela os dados de todos os objetos.
 */

public class App {
	
	//private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Pessoa> arrayPessoas = new ArrayList<Pessoa>();
		
		cadastrar(arrayPessoas);
		imprimir(arrayPessoas);
		imprimirNomePessoas(arrayPessoas);
	}

	private static void cadastrar(ArrayList<Pessoa> arrayPessoas) {
		arrayPessoas.add(new Pessoa("Ana", "123456789", new Endereco("Rua João", "Próximo a igreja", "Cariacica", "ES", 1228, 29153400)));
		arrayPessoas.add(new Pessoa("Cinthia", "987654321"));
		arrayPessoas.add(new Aluno("Lucas", "09090909", 24110705, "Engenharia da Computação" ));
		arrayPessoas.add(new Aluno("Karoliny", "274920870", 24112986, "Ciência da Computação"));
	}

	private static void imprimir(ArrayList<Pessoa> arrayPessoas) {
		for (Pessoa p : arrayPessoas) {
			System.out.println(p); //p.toString()
			System.out.println();
		}
	}
	
	private static void imprimirNomePessoas(ArrayList<Pessoa> arrayPessoas) {
		System.out.println("PESSOAS: ");
		
		for (Pessoa p : arrayPessoas) {
			if (!(p instanceof Aluno)) {
				System.out.println(p.getNome());
			}
			
		}
		
	}

	
	

}
