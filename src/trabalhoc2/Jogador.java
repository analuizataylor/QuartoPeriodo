package trabalhoc2;

/*
(1,0) 4 – Classe Jogador que implementa Jogavel.

ATRIBUTOS:
• nome
• vida (deve ser inicializada com 2)
• defesa (deve ser inicializada com 50)

METODOS:
• Construtor
• Gets
• Demais métodos necessários
 */

public class Jogador implements iJogavel {

    // NOME DO JOGADOR
    private String nome;
    // VIDA INICIALIZADA COM 2
    private int vida = 2;
    // DEFESA INICIALIZADA COM 50
    private int defesa = 50;

    // CONSTRUTOR SOMENTE COM NOME POIS VIDA E DEFESA JA ESTAO PRE DEFINIDOS
    public Jogador(String nome) {
        this.nome = nome;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Jogador " + nome + " | Vida: " + vida + " | Defesa: " + defesa;
    }

    // METODOS DA INTERFACE IJOGAVEL
    // [[NECESSARIO CODAR O METODO]]
    @Override
    public void atacar(int poder) {
    }

    @Override
    public void defender(int poder) {
    }

    @Override
    public boolean estaVivo() {
        return false;
    }
}
