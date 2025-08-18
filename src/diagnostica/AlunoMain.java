package diagnostica;
import java.util.Scanner;

public class AlunoMain {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        Aluno [] alunos = new Aluno[30];
        int opcao;

        do {
            System.out.println("1 - Cadastrar"
                    + "\n2 - Imprimir um aluno"
                    + "\n3 - Imprimir todos os alunos"
                    + "\n4 - Alterar nota1"
                    + "\n5 - Alterar nota 2"
                    + "\n6 - Sair");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao) {
                case 1:
                    cadastrar(alunos);
                    break;
                case 2:
                    imprimirAluno(alunos);
                    break;
                case 3:
                    imprimirTodosAlunos(alunos);
                    break;
                case 4:
                    alterarNota01(alunos);
                    break;
                case 5:
                    alterarNota02(alunos);
                    break;
                case 6:
                    System.out.println("Fim do programa....");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    public static void cadastrar(Aluno[] alunos) {
        String nome;
        int matricula;
        double nota01, nota02, media;

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] == null) {

                System.out.println("[CADASTRO DO  ALUNO]");

                System.out.println("Nome: ");
                nome = entrada.nextLine();

                System.out.println("Matrícula: ");
                matricula = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Nota 1: ");
                nota01 = entrada.nextDouble();
                entrada.nextLine();

                System.out.println("Nota 2: ");
                nota02 = entrada.nextDouble();
                entrada.nextLine();

                media = (nota01 + nota02) /2;

                alunos[i] = new Aluno(nome, matricula, nota01, nota02, media);
                System.out.println("Aluno cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("A turma está lotada!");
    }


    public static void imprimirAluno(Aluno[] alunos) {
        String nome;

        System.out.println("Informe o nome do aluno: ");
        nome = entrada.nextLine();

        System.out.println("[NOTA DO  ALUNO]");

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.print("Aluno = " + alunos[i].getNome() + " | Média = " + alunos[i].getMedia() + "\n");
            }
        }
    }

    public static void imprimirTodosAlunos(Aluno[] alunos) {
        System.out.println("[NOTAS DOS  ALUNOS]");

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.print("Aluno = " + alunos[i].getNome() + " | Nota 1 = " + alunos[i].getNota01() + ""
                        + " | Nota 2 = " + alunos [i].getNota02() + " | Média = " + alunos[i].getMedia() + "\n");
            }
        }
    }

    public static void alterarNota01(Aluno[] alunos) {
        String nome;
        int novaNota01;

        System.out.println("[ALTERAR NOTA 1");

        System.out.println("Informe o nome do aluno: ");
        nome = entrada.nextLine();

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.print("Aluno = " + alunos[i].getNome() + " | Nota 1 = " + alunos[i].getNota01() + "\n");

                System.out.println("Informe a nova nota 1: ");
                novaNota01 = entrada.nextInt();
                entrada.nextLine();
                alunos[i].setNota01(novaNota01);

                System.out.println("[NOTA 1 ALTERADA");
                System.out.print("Aluno = " + alunos[i].getNome() + " | Nota 1 = " + alunos[i].getNota01() + "\n");
            }
        }
    }

    public static void alterarNota02(Aluno[] alunos) {
        String nome;
        int novaNota02;

        System.out.println("[ALTERAR NOTA 2");

        System.out.println("Informe o nome do aluno: ");
        nome = entrada.nextLine();

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.print("Aluno = " + alunos[i].getNome() + " | Nota 2 = " + alunos[i].getNota02() + "\n");

                System.out.println("Informe a nova nota 2: ");
                novaNota02 = entrada.nextInt();
                entrada.nextLine();
                alunos[i].setNota01(novaNota02);

                System.out.println("[NOTA 2 ALTERADA");
                System.out.print("Aluno = " + alunos[i].getNome() + " | Nota 2 = " + alunos[i].getNota02() + "\n");
            }
        }
    }
}
