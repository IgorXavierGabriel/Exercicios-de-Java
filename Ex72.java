import java.util.Scanner;

class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        // 1. Leitura
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Vetor B[" + i + "]: ");
            vetorB[i] = scan.nextInt();
        }

        // 2. Lógica para Intercalar
        // O loop roda 10 vezes (tamanho dos vetores menores)
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i * 2] = vetorA[i];       // Posições 0, 2, 4, 6...
            vetorC[i * 2 + 1] = vetorB[i];   // Posições 1, 3, 5, 7...
        }

        // 3. Exibição
        System.out.println("\nVetor C (Intercalado): ");
        for(int n : vetorC) {
            System.out.print(n + " ");
        }

        scan.close();
    }
}