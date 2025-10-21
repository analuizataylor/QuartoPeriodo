package trabalhoc2;

/*
(0,25 cada) 2 – Subclasses de Carta:
Devem herdar de Carta e sobrescrever o metodo jogar(),
aplicando efeitos distintos conforme o tipo.

    a) CartaAtaque – O metodo jogar() ataca o inimigo com o poder da carta e, incrementa cartasJogadas
 */

public class CartaAtaque extends Carta{

    // CONSTRUTOR COM SUPER
    public CartaAtaque (String nome, int poder) {
        super(nome, poder);
    }

    // METODO JOGAR COM OVERRIDE
    // ATACA O INIMIGO COM O PODER DA CARTA E INCREMENTA CARTASJOGADAS
    // [[NECESSARIO PREENCHER O METODO]]
    @Override
    public void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado) {

    }
}
