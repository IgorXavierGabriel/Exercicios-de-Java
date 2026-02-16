import java.util.Scanner;

class Ex53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        // Preenchendo o vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição do vetor A " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        // Preenchendo o vetor B
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o valor da posição do vetor B " + i + ": ");
            vetorB[i] = scan.nextInt();
        } 

        // Multiplicação: Vetor C[i] = A[i] * B[i]
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        // Mostrando os resultados
        System.out.print("\nVetor A: ");
        for (int v : vetorA) System.out.print(v + " ");

        System.out.print("\nVetor B: ");
        // Ajustado: Usando print comum pois os valores são int
        for (int v : vetorB) System.out.print(v + " ");

        System.out.print("\nVetor C (Multiplicação): ");
        // Ajustado: Usando print comum
        for (int v : vetorC) System.out.print(v + " ");

        scan.close();
    }
}