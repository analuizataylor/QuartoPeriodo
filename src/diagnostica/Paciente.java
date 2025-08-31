package diagnostica;

/*
CLASSE PACIENTE
ATRIBUTOS: nome, CPF, data de nascimento e historico
METODOS: construtor, gets para todos, sets para nome e historico, toString
 */

public class Paciente {
    private String nome, cpf, dataNasc, historico;

    public Paciente (String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.historico = "";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico += historico;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    public String toString() {
        return (this.nome+"  "+this.cpf+"  "+this.dataNasc+
                "\n"+this.historico);
    }
}
