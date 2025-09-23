package AppAluno;

/*
 * Fazer a Classe Aluno, que herda de Pessoa, e tem os atributos:
 * -> matricula (inteiro)
 * -> curso (String)
 * 
 * E os métodos:
 * -> 3 construtores
 * -> getters
 * -> setters
 * -> toString
 */

public class Aluno extends Pessoa{
	
	private int matricula;
	private String curso;
	
	// CONSTRUTOR COMPLETO
	public Aluno(String nome, String cpf, Endereco end, int matricula, String curso) {
		super(nome, cpf, end);
		this.matricula = matricula;
		this.curso = curso;
	}

	// CONSTRUTOR VAZIO
	public Aluno() {
		super();
		this.curso = "";
	}
	
	// CONSTRUTOR SEM ENDERECO
	public Aluno(String nome, String cpf, int matricula, String curso) {
		super(nome, cpf);
		this.matricula = matricula;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMatricula: " + matricula + "    Curso: " + curso;
		//return "Nome: " + super.getNome() + "  Matricula: " + matricula + " Curso: " + curso;
	}
	
	
	
	
	

}
