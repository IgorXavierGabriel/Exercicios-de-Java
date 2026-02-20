import java.util.Scanner;

class Ex56 { // Seguindo sua numeração lógica
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
              
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
            if ( vetorA[i] % 2 ==0 ) {
                System.out.println("Posição " + i + " contém o número par: " + vetorA[i]);
                
            }
        }

        scan.close();
    }
}