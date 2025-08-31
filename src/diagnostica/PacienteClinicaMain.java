package diagnostica;
import java.util.Scanner;

/* APLICATIVO PARA CLINICA

CLASSE PACIENTE
ATRIBUTOS: nome, CPF, data de nascimento e historico
METODOS: construtor, gets para todos, sets para nome e historico, toString


VETOR DE PACIENTES
ATRIBUTOS: vet, quant
METODOS: construtor, getQuant, getPacciente, pesquisa, insere


APP CLINICA MAIN
MENU:
1 - Cadastrar
2 - Consultar
3 - Imprimir Cadastro
4 - Sair
*/


public class PacienteClinicaMain {
    private static Scanner entrada = new Scanner(System.in);

    public static void main (String[] args) {

        int opcao;
        PacienteVet cadastro = new PacienteVet(10);

        do {
                System.out.println("1 - Cadastrar\n" +
                        "2 - Consultar\n" +
                        "3 - Imprimir Cadastro\n" +
                        "4 - Sair\n" +
                        "Digite sua opção: ");
                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrar(cadastro);
                        break;
                    case 2:
                        consultar(cadastro);
                        break;
                    case 3:
                        imprimir(cadastro);
                        break;
                    case 4:
                        System.out.println("SAINDO DO PROGRAMA..");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
        } while (opcao != 4);
    }

    private static void cadastrar(PacienteVet cadastro) {
        String nome, cpf, data;
        int erro;
        Paciente p;

        System.out.println("Digite o CPF");
        cpf = entrada.nextLine();

        System.out.println("Digite o Nome");
        nome = entrada.nextLine();

        System.out.println("Digite a data de Nascimento no formato dd/mm/aaaa");
        data = entrada.nextLine();

        p = new Paciente(nome, cpf, data);
        erro = cadastro.insere(p);


        if (erro == 0) {
            System.out.println("CADASTRO REALIZADO COM SUCESSO");
        } else if (erro == -1){
            System.err.println("CADASTRO CHEIO - NAO FOI POSSIVEL CADASTRAR");
        } else {
            System.err.println("PACIENTE JA CADASTRADO");
        }
    }

    private static void consultar(PacienteVet cadastro) {
        String cpf;

        System.out.println("Digite o CPF");
        cpf = entrada.nextLine();

        int pos = cadastro.pesquisa(cpf);
        if (pos < 0) {
            System.err.println("PACIENTE NAO CADASTRADO");;
        }else {
            System.out.println("PACIENTE  \n"+ cadastro.getPaciente(pos).toString());
        }
    }

    private static void imprimir(PacienteVet cadastro) {
        Paciente paciente;

        for (int i = 0; i < cadastro.getQuant(); i++) {

            paciente = cadastro.getPaciente(i);
            System.out.println(paciente.getNome()+"  "+
                    paciente.getCpf()+"  "+
                    paciente.getDataNasc());
        }
    }
}


