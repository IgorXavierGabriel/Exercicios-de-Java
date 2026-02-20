import java.util.Scanner;

class Ex61 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
              
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
            
        }
        for ( int i = 0; i<vetorA.length; i++){
            if (vetorA[i] % 0) {
                System.out.println("O numero e par");
                
            }else System.out.println("O numero e impar");
           
           
        } 
        

        scan.close();
    }
}