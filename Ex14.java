import java.util.Scanner;

class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de KG: ");
        double Quilos = scan.nextDouble();

        if (Quilos > 50) {
            double peso = ( Quilos - 50 ) * 4;
            System.out.println("João voce vai precisar pagar: " + peso + " Reais");

            
        } 
        else System.out.println("João esta tudo certo");
        
      
    }
}