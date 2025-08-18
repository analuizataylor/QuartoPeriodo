package diagnostica;

/*
1 -AVALIAÇÃO DIAGNÓSTICA
Examine o problema abaixo e escreva apenas os códigos
pedidos. O código deve ser escrito na linguagem Java e
postado no ENVIO DE TRABALHO.
1) Suponha que você queira fazer um aplicativo para uma
clínica. Construa duas classes (Paciente e VetPaciente),
conforme especificado a seguir:
a) Paciente que possui:
ATRIBUTOS:
nome,
CPF,
Data de Nascimento (pode ser String),
Histórico.
MÉTODOS:
construtor,
gets (para todos os atributos),
sets (somente para nome e histórico),
toString (com as informações: nome, cpf e data de
nascimento em uma linha e histórico na linha de
baixo).
b) VetPaciente que possui:
ATRIBUTOS:
vet (vetor de Paciente),
quant (quantidade de Pacientes que estão
armazenados no vetor).
2
MÉTODOS:
construtor,
getQuant,
getPaciente (recebe uma posição e retorna o paciente
desta posição ou null se a posição for inválida),
pesquisa (recebe o cpf do paciente e retorna a posição
do paciente que tem este cpf ou -1, se não encontrar),
insere (recebe um Paciente e insere na primeira
posição vazia do vetor. Se o vetor estiver cheio retorna
-1, se o paciente já foi cadastrado retorna -2, se a
operação foi bem sucedida, retorna 0),
c) AppClinica que é um aplicativo que cria um cadastro de
pacientes e tenha o seguinte menu:
1 – Cadastrar
2 – Consultar
3 – Imprimir Cadastro
4 – Sair
O app deverá ser construídos usando métodos.
Na opção 2 - Consultar você deve pedir o CPF do paciente e
mostrar na tela nome, CPF e data de nascimento em uma linha
e o Histórico em outra linha. Se o paciente não existir, você
deve apresentar uma mensagem de erro.
Na opção 3 - Imprimir Cadastro você deve mostrar na tela
apenas nome e CPF de cada paciente, um por linha
 */