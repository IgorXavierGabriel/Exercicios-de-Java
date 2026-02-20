import java.util.Scanner;

class Ex63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] idades = new int[10];
        
        // 1. Entrada de dados
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scan.nextInt();
        }

        // 2. Inicializamos com o primeiro elemento
        int maiorIdade = idades[0];
        int posicaoMaior = 0;
        int menorIdade = idades[0];
        int posicaoMenor = 0;

        // 3. Comparação (começamos do índice 1 já que o 0 já foi usado)
        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
            
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                posicaoMenor = i;
            }
        }

        // 4. Exibição dos resultados
        System.out.println("\n--- RELATÓRIO DE IDADES ---");
        System.out.println("Maior idade: " + maiorIdade + " (Posição no vetor: " + posicaoMaior + ")");
        System.out.println("Menor idade: " + menorIdade + " (Posição no vetor: " + posicaoMenor + ")");

        scan.close();
    }
}