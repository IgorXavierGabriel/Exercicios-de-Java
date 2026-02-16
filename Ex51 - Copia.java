import java.util.Scanner;

class Ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        // Mudamos o vetorB para double para suportar os resultados da raiz quadrada
        double[] vetorB = new double[15];

        // Preenchendo o vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        // Construindo o vetor B com a raiz quadrada
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
        } 

        // Mostrando os resultados
        System.out.print("\nVetor A: ");
        for (int v : vetorA) System.out.print(v + " ");

        System.out.print("\nVetor B (Raízes): ");
        // Usamos printf para não mostrar tantas casas decimais
        for (double v : vetorB) System.out.printf("%.2f ", v);

        scan.close();
    }
}