import java.util.Scanner;

class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
       

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Vetor B[" + i + "]: ");
            vetorB[i] = scan.nextInt();
        }for (int i = 0;i<vetorC.length; i++ ){
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] =1;
                
            }else if (vetorA[i] == vetorB[i]) {
                vetorC[i] += 0; 
                
            }else vetorC[i] =-1; 
        }System.out.println("\nResultado da comparação (Vetor C):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");}

       
        


}}