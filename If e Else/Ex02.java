import java.util.Scanner;

class Ex02{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        double num1 = scan.nextDouble();
        if (num1 >= 0) {
            System.out.println( num1 + " numero e positivo");
            
        } 
            
        else System.out.println(num1 + " numero e negativo");

        

        
    }
}