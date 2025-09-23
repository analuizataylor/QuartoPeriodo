package AppAluno;

/*
 * Fazer a classe Pessoa com os atributos:
 * -> nome (String
 * -> cpf (String)
 * -> endereco (Endereco)
 * 
 * E os métodos:
 * -> um construtor com todos os atributos
 * -> um construtor com nome e cpf
 * -> um construtor vazio
 * -> getters
 * -> setters
 * -> toString 
 */
public class Pessoa {
	private String nome, cpf;
	private Endereco end;
	
	// CONSTRUTOR COMPLETO
	public Pessoa(String nome, String cpf, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
	}

	// CONSTRUTOR COM NOME E CPF
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.end = new Endereco();
	}

	// CONSTRUTOR VAZIO
	public Pessoa() {
		this.nome = "";
		this.cpf = "";	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "        CPF: " + cpf + "\n" + end;
	}
}

