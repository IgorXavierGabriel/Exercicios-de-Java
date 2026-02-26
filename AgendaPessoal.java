import java.util.Scanner;

public class AgendaPessoal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Matriz: 31 dias (linhas) por 24 horas (colunas)
        String[][] agenda = new String[31][24];
        
        int opcao;
        boolean sair = false;

        while (!sair) {
            System.out.println("\n--- AGENDA PESSOAL ---");
            System.out.println("1. Adicionar/Alterar Compromisso");
            System.out.println("2. Consultar Compromisso");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            if (opcao == 1) { // Adicionar
                System.out.print("Digite o dia (1-31): ");
                int dia = scan.nextInt();
                System.out.print("Digite a hora (0-23): ");
                int hora = scan.nextInt();
                
                scan.nextLine(); // Limpar o buffer
                System.out.print("Digite o compromisso: ");
                agenda[dia - 1][hora] = scan.nextLine();
                
                System.out.println("Compromisso agendado com sucesso!");

            } else if (opcao == 2) { // Consultar
                System.out.print("Digite o dia (1-31): ");
                int dia = scan.nextInt();
                System.out.print("Digite a hora (0-23): ");
                int hora = scan.nextInt();

                String tarefa = agenda[dia - 1][hora];
                if (tarefa == null || tarefa.isEmpty()) {
                    System.out.println("Nenhum compromisso agendado para este horário.");
                } else {
                    System.out.println("Compromisso: " + tarefa);
                }

            } else if (opcao == 0) {
                sair = true;
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}