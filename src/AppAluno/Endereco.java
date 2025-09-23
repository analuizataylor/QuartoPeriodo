package AppAluno;

public class Endereco {
	
	private String logradouro, complemento, cidade, estado;
	private int numero, cep;
	
	// CONSTRUTOR COMPLETO
	public Endereco(String logradouro, String complemento, 
			String cidade, String estado, int numero, int cep) {
		super();
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
	}
	
	// CONSTRUTOR VAZIO
	public Endereco() {
		this.logradouro = "";
		this.complemento = "";
		this.cidade = "";
		this.estado = "";
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
	@Override
	public String toString() {
		return "Logradouro: " + logradouro +
				"    Numero: "+ numero + "  \nComplemento: " + complemento + "    CEP: " + cep + 
				"\nCidade: " + cidade + "    Estado:" + estado; // vai corinthians!!!!!!
	}
}

