package diagnostica;

// ARMAZENA INFORMACOES DO PACIENTE

public class Paciente {
    // ATRIBUTOS
    private String nome;
    private String cpf; 
    private String dataNascimento; 
    private String historico;

 
    public Paciente(String nome, String cpf, String dataNascimento, String historico) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.historico = historico;
    }

    // MÉTODOS GET
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getHistorico() {
        return historico;
    }

    // MÉTODOS SET
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento +
               "\nHistórico: " + historico;
    }
}