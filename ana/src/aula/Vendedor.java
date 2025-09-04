
package aula;
/*
 * Suponha que uma loja possua três categorias de vendedores, 
 * classificadas de acordo com o tempo de serviço. Crie a classe 
 * Vendedor com as seguintes especificações:
 * Atributos:
 *    nome 
 *    salarioBase (inicialmente R$ 2.000,00)
 *    tempoServico (em meses)
 *    categoria (A, B ou C, conforme as regras: A se tempo de serviço > 60 meses, 
 *              B entre 30 e 60 meses inclusive, C se menor que 30 meses)
 *    totalVendas (valor total das vendas realizadas pelo vendedor)
 */
public class Vendedor {
	private String nome;
	private char categoria;
	private int tempoServ;
	private double totalVendas;
	private static double salarioBase=2000;
	
	public Vendedor(String nome, int tempoServ, double totalVendas) {
		this.nome = nome;
		this.tempoServ = tempoServ;
		this.totalVendas = totalVendas;
		setCategoria();
	}
	
	public Vendedor(String nome) {
		super();
		this.nome = nome;
		this.tempoServ = 0;
		this.totalVendas = 0;
		setCategoria();
	}



	private void setCategoria () {
		if (this.tempoServ > 60) {
			this.categoria = 'A';
		} else if (this.tempoServ < 30) {
			this.categoria = 'C';
		} else {
			this.categoria = 'B';
		}
	}
	
	public char getCategoria() {
		return categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoServ() {
		return tempoServ;
	}

	public void setTempoServ(int tempoServ) {
		this.tempoServ = tempoServ;
		setCategoria();
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	// get e set do atributo estatico deve ser estatico tambem
	public static double getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(double salarioBase) {
		Vendedor.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Nome= " + nome + "     Categoria=" + categoria ;
	}

	/*
	 * comissao() → calcula e retorna a comissão:
	 *      20% do total de vendas se ultrapassar R$ 20.000,00
	 *      15% se entre R$ 10.000,00 e R$ 20.000,00 inclusive
	 *      5% se abaixo de R$ 10.000,00
	 */
	public double comissao () {
		if (this.totalVendas < 10000) {
			return this.totalVendas*0.05;
		}
		if (this.totalVendas > 20000) {
			return this.totalVendas*0.2;
		}
		return this.totalVendas*0.15;
	}
	
	/*
	 * gratificacao() → calcula e retorna a gratificação:
	 *     15% do salário base para categoria A
	 *     7,5% para categoria B
	 */
	public double gratificacao() {
		if (this.categoria=='A') {
			return Vendedor.salarioBase*0.15;
		}
		if (this.categoria=='B') {
			return Vendedor.salarioBase*0.075;
		}
		return 0;
	}
	
	/*
	 * salario() → calcula e retorna o salário total: 
	 *             salário base + comissão + gratificação
	 */
			
	public double salario() {		
		return Vendedor.salarioBase+comissao()+gratificacao();
	} 
}
