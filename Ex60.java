import java.util.Scanner;

class Ex60 { // Seguindo sua numeração lógica
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int soma = 0;
        double media = 0;
              
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
            
        }
        for ( int i = 0; i<vetorA.length; i++){
           soma += vetorA[i];
           
        } media = (double) soma / vetorA.length;
        System.out.println("A soma de todos os valores do vetor são: " +soma);

        scan.close();
    }
}