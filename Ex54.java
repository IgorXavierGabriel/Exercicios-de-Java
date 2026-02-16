import java.util.Scanner;

class Ex55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        // 1. Lendo o Vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }

        // 2. Calculando o Vetor B (Resto da divisão por 2)
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] % 2;
        }

        // 3. Mostrando os resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.print("Vetor A: ");
        for (int v : vetorA) System.out.print(v + " ");

        System.out.print("\nVetor B (Restos): ");
        for (int v : vetorB) System.out.print(v + " ");
        
        System.out.println("\n\nNota: Se B[i] for 0 o número é PAR, se for 1 é ÍMPAR.");

        scan.close();
    }
}