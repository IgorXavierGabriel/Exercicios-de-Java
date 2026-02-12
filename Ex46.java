import java.util.Scanner;

class Ex46{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade  de produtos comprados: ");
        int produtos = scan.nextInt();
        double soma = 0;

        for( int i = 1; i <= produtos; i++){
             soma = i * 1.99;
            
           System.out.printf("%d - R$ %.2f\n", i, soma);
        
        } 
        
       
        scan.close();
        
      
    }
}