package trabalhoc2;

/*
(0,25 cada) 2 – Subclasses de Carta:
Devem herdar de Carta e sobrescrever o metodo jogar(),
aplicando efeitos distintos conforme o tipo.

    b) CartaDefesa – O metodo jogar() aumenta a defesa do jogador com o poder da carta e, incrementa cartasJogadas
 */

public class CartaDefesa extends Carta{

    // CONSTRUTOR COM SUPER
    public CartaDefesa (String nome, int poder) {
        super(nome, poder);
    }

    // METODO JOGAR COM OVERRIDE
    // AUMENTA A DEFESA DO JOGADOR COM O PODER DA CARTA E INCREMENTA CARTASJOGADAS
    // [[NECESSARIO PREENCHER O METODO]]
    @Override
    public void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado) {

    }
}
