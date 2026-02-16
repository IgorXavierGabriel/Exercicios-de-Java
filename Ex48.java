import java.util.Scanner;

class Ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. Criar o vetor A com 5 elementos inteiros
        int[] vetorA = new int[5];
        // 2. Criar o vetor B de mesmo tipo e tamanho
        int[] vetorB = new int[5];

        // Preenchendo o vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        // Construindo o vetor B (B[i] = A[i])
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        // Mostrando os resultados
        System.out.print("\nVetor A: ");
        for (int v : vetorA) System.out.print(v + " ");

        System.out.print("\nVetor B: ");
        for (int v : vetorB) System.out.print(v + " ");

        scan.close();
    }
}