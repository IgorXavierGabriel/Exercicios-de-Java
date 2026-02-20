import java.util.Scanner;

class Ex59 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
              
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
            
        }
        for ( int i = 0; i<vetorA.length; i++){
            if (vetorA[i] % 5 == 0) {
                System.out.println("O numero:" + vetorA[i]  + " e multiplo de 5");
                
            }
           
        }
      

        scan.close();
    }
}