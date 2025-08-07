package diagnostica;

import java.util.Scanner;

public class MainPaciente {

    private static Scanner scanner = new Scanner(System.in);
    private static VetPaciente cadastro = new VetPaciente(100);

    public static void main(String[] args) {
        int opcao;
        do {
        	System.out.println("--- MENU DA CLÍNICA ---");
            System.out.println("1 – Cadastrar Paciente");
            System.out.println("2 – Consultar Paciente");
            System.out.println("3 – Imprimir Cadastro");
            System.out.println("4 – Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = Integer.parseInt(scanner.nextLine()); 
            switch (opcao) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    consultarPaciente();
                    break;
                case 3:
                    imprimirCadastro();
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (opcao != 4);
        
        scanner.close();
    }

    public static void cadastrarPaciente() {
        System.out.println("\n--- Cadastro de Paciente ---");
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Digite a Data de Nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();
        
        System.out.print("Digite o histórico inicial: ");
        String historico = scanner.nextLine();

        Paciente novoPaciente = new Paciente(nome, cpf, dataNascimento, historico);
        int resultado = cadastro.insere(novoPaciente);

        if (resultado == 0) {
            System.out.println("Paciente cadastrado com sucesso!");
        } else if (resultado == -1) {
            System.out.println("Erro: O sistema está cheio. Não é possível cadastrar mais pacientes.");
        } else if (resultado == -2) {
            System.out.println("Erro: Já existe um paciente com este CPF.");
        }
    }
}
