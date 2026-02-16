import java.util.Scanner;

class Ex54 { // Seguindo sua numeração lógica
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[10]; // Double para precisão na divisão

        // 1. Lendo Vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }

        // 2. Lendo Vetor B
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Vetor B[" + i + "]: ");
            vetorB[i] = scan.nextInt();
            
            // Verificação de segurança: divisão por zero
            if (vetorB[i] == 0) {
                System.out.println("Aviso: Divisão por zero detectada. O resultado será 'Infinity'.");
            }
        } 

        // 3. Calculando Vetor C (C[i] = A[i] / B[i])
        for (int i = 0; i < vetorA.length; i++) {
            // Usamos (double) para forçar o Java a fazer conta com vírgula
            vetorC[i] = (double) vetorA[i] / vetorB[i];
        }

        // Mostrando os resultados
        System.out.print("\nVetor A: ");
        for (int v : vetorA) System.out.print(v + " ");

        System.out.print("\nVetor B: ");
        for (int v : vetorB) System.out.print(v + " ");

        System.out.print("\nVetor C (Divisão): ");
        for (double v : vetorC) System.out.printf("%.2f ", v);

        scan.close();
    }
}