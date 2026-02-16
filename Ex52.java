import java.util.Scanner;

class Ex52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        // Mudamos o vetorB para double para suportar os resultados da raiz quadrada
        double[] vetorB = new double[10];
        double [] vetorC =new double[10];


        // Preenchendo o vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetorB[i] = scan.nextDouble();
        
        } 
        for (int i = 0; i <vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB [i];
        }

        // Mostrando os resultados
        System.out.print("\nVetor A: ");
        for (int v : vetorA) System.out.print(v + " ");

        System.out.print("\nVetor B: ");
       
        for (double v : vetorB) System.out.printf("%.2f ", v);

        System.out.print("\nVetor C: ");

        for (double v : vetorC) System.out.printf("%.2f ", v);


        scan.close();
    }
}