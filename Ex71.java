import java.util.Scanner;

class Ex71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
          
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }

        
        System.out.println("\nVetor A: ");
        for(int n : vetorA) System.out.print(n + " ");

        System.out.println("\nVetor B (Invertido): ");
        for(int n : vetorB) System.out.print(n + " ");

        scan.close();
    }
}