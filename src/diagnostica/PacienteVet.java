package diagnostica;

/* VETOR DE PACIENTES
ATRIBUTOS: vet, quant
METODOS: construtor, getQuant, getPacciente, pesquisa, insere
*/

public class PacienteVet {

    // ATRIBUTOS
    private Paciente[] vet;
    private int quant;

    // CONSTRUTOR
    public PacienteVet (int tamanho) {
        this.vet = new Paciente[tamanho];
        this.quant = 0;
    }

    // GET QUANT
    public int getQuant() {
        return quant;
    }

    // GET PACIENTE PELA POSICAO
    public Paciente getPaciente(int pos) {
        if (pos >= 0 && pos < this.quant)
            return vet[pos];
        return null;
    }

    // METODO PESQUISAR
    public int pesquisa (String cpf) {
        for (int i = 0; i < this.quant; i++) {
            if (cpf.equals(this.vet[i].getCpf())) {
                return i;
            }
        }
        return -1;
    }

    // METODO INSERIR
    public int insere (Paciente paciente) {
        if (this.vet.length == this.quant) {
            return -1;
        }

        int pos = pesquisa(paciente.getCpf());
        if (pos >= 0) {
            return 2;
        }

        this.vet[this.quant] = paciente;
        this.quant++;
        return 0;
    }
}
