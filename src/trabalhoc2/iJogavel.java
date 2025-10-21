package trabalhoc2;

/*
(0,25) 3 – Interface Jogavel:
Define o contrato para qualquer entidade que possa participar do jogo.

METODOS:
• atacar: recebe o poder e não retorna nada
    → Esse metodo, quando implementado, reduz a defesa do jogador atacado (inimigo);
    → Se a defesa cair abaixo de zero, perde 1 ponto de vida e a defesa é aumentada em +100;
        Por exemplo, se a defesa cair para -20, deve aumentar em 100 e ir para 80.

• defender: recebe o poder e não retorna nada
    → Esse metodo aumenta a defesa do jogador;

• estaVivo: retorna um booleano
    → Esse metodo retorna true se a vida e a defesa forem maiores que zero;
 */

public interface iJogavel {
    public void atacar (int poder);
    public void defender (int poder);
    public boolean estaVivo();


}
