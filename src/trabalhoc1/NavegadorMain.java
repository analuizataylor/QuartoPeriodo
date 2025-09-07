package trabalhoc1;
import java.util.Scanner;

public class NavegadorMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {

        PilhaPaginas navegador = new PilhaPaginas();
        int opcao;

        do {
            System.out.println("Bem-vindo ao Navegador Simples!\n" +
                    "--- Menu ---\n" +
                    "1 - Acessar nova página\n" +
                    "2 - Voltar para a página anterior\n" +
                    "3 - Ver página atual\n" +
                    "4 - Exibir histórico de Navegação\n" +
                    "5 - Sair\n" +
                    "----------\n" +
                    "Digite sua opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    novaPagina(navegador);
                    break;
                case 2:
                    voltarPagina(navegador);
                    break;
                case 3:
                    paginaAtual(navegador);
                    break;
                case 4:
                    exibirHistorico(navegador);
                    break;
                case 5:
                    System.out.println("Saindo do navegador...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void novaPagina(PilhaPaginas navegador) {

        // SOLICITA O TITULO E URL
        System.out.print("Digite o título da página: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite a URL da página: ");
        String url = scanner.nextLine();

        // ADICIONA A PAGINA NO TOPO DA PILHA
        navegador.push(new Pagina (url, titulo) );

        System.out.println("Página adicionada ao histórico do navegador com sucesso!");
    }

    private static void voltarPagina(PilhaPaginas navegador) {

        // VERIFICA SE O HISTORICO ESTA VAZIO
        if (navegador.isEmpty()) {
            System.err.println("ERRO: O histórico está vazio.");
            return;
        }

        Pagina removida = navegador.pop(); // REMOVE PAGINA ATUAL
        Pagina anterior = navegador.peek(); // PEGA A PAGINA ANTERIOR

        if (anterior == null) {
            System.out.println("Você voltou da página: " + removida);
            System.out.println("Não há mais páginas no histórico.");
        } else {
            System.out.println("Você voltou da página: " + removida);
            System.out.println("Agora está em: " + anterior);
        }
    }

    private static void paginaAtual(PilhaPaginas navegador) {

        // RETORNA O ULTIMO ELEMENTO DA PILHA
        Pagina paginaAtual = navegador.peek();

        // VERIFICA SE O HISTORICO ESTA VAZIO
        if (paginaAtual == null) {
            System.err.println("ERRO: O histórico está vazio.");
        } else {
            System.out.println("Página atual...");
            System.out.println(paginaAtual);
        }
    }

    private static void exibirHistorico(PilhaPaginas navegador) {

        // VERIFICA SE O HISTORICO ESTA VAZIO
        if (navegador.isEmpty()) {
            System.err.println("ERRO: O histórico está vazio.");
            return;
        }

        System.out.println("=== Histórico de Navegação ===");

        // CRIA PILHA AUXILIAR PARA PERCORRER
        PilhaPaginas pilhaAux = new PilhaPaginas();

        while (!navegador.isEmpty()) {
            pilhaAux.push(navegador.pop());
        }

        while (!pilhaAux.isEmpty()) {
            Pagina p = pilhaAux.pop();
            System.out.println(p);
            navegador.push(p); // devolve para a pilha original
        }
    }
}
