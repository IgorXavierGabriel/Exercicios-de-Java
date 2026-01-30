import java.util.Scanner;

class Ex01{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println("Numero " + num1 + " é maior");
            
        } else System.out.println("Numero " +num2 + "  é maior");

        

        
    }
}