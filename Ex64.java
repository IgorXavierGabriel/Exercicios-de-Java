import java.util.Scanner;

class Ex64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Inicialização correta dos vetores
        double[] notas1 = new double[10];
        double[] notas2 = new double[10];
        double[] mediasResultantes = new double[10]; 

        // 1. Lendo as primeiras notas
        for (int i = 0; i < notas1.length; i++) {
            System.out.print("Digite a nota 1 do aluno " + (i + 1) + ": ");
            notas1[i] = scan.nextDouble();
        }

        // 2. Lendo as segundas notas
        for (int i = 0; i < notas2.length; i++) {
            System.out.print("Digite a nota 2 do aluno " + (i + 1) + ": ");
            notas2[i] = scan.nextDouble();
        }

        // 3. Calculando a média de CADA aluno e armazenando no vetor de médias
        for (int i = 0; i < notas1.length; i++) {
            mediasResultantes[i] = (notas1[i] + notas2[i]) / 2;
        }

        // 4. Exibição dos resultados
        System.out.println("\n--- RELATÓRIO DE MÉDIAS ---");
        for (int i = 0; i < mediasResultantes.length; i++) {
            System.out.printf("Aluno %d - Média: %.2f - Status: %s\n", 
                (i + 1), 
                mediasResultantes[i], 
                (mediasResultantes[i] >= 7 ? "Aprovado" : "Reprovado"));
        }

        scan.close();
    }
}