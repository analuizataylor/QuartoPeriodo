package trabalhoc2;

/*
(0,5) 1 – Classe Abstrata Carta:
Representa o modelo geral de uma carta do jogo.

ATRIBUTOS:
• nome: nome da carta
• poder: valor numérico de impacto
• cartasJogadas: atributo de classe, indicando quantas cartas foram jogadas no total.

OBS: Deve ter visibilidade somente nas classes herdeiras e nas do mesmo pacote

METODOS:
• Construtor com parâmetros
• gets para todos
• toString()
• Metodo abstrato JOGAR, que deve receber o jogador da vez e o jogador que será
atacado e não retorna nada
*/

// [[AQUI PRECISA IMPLEMENTAR A INTERFACE??]

public abstract class Carta{

    // NOME DA CARTA
    protected String nome;
    // VALOR NUMERICO DO IMPACTO
    protected int poder;
    // ATRIBUTO DE CLASSE QUE INDICA QUANTAS CARTAS FORAM JOGADAS NO TOTAL
    protected static int cartasJogadas;

    // CONSTRUTOR COM PARAMETROS
    public Carta (String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public static int getCartasJogadas() {
        return cartasJogadas;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Nome da Carta: " + nome + "\n Poder da Carta:" + poder;
    }

    // METODO ABSTRATO JOGAR
    public abstract void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado);
}
