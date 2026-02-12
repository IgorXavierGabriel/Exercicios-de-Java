import java.util.Scanner;

class Ex45{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade total de CDs: ");
        int cds = scan.nextInt();
        double valorTotal= 0;

        for( int i = 1; i <= cds; i++){
            System.out.println("Digite os valores de todos os cds: ");
            double valor  = scan.nextDouble();
            valorTotal += valor;
        
        } double media = valorTotal / cds;
        System.out.println(" O valor total investido foi " + valorTotal + "R$" + " é sua media e de: " + media);
       
        scan.close();
        
      
    }
}