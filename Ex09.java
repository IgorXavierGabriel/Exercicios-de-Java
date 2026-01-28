import java.util.Scanner;

class Ex09{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");

        double fare = scan.nextDouble();
        double celsius = 5*(fare-32)/9;
        System.out.println("a temperatura em celsius e: " + celsius);

        
    }
}