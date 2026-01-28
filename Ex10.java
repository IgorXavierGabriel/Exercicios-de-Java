import java.util.Scanner;

class Ex10{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");

        double celsius = scan.nextDouble();
        double fare = celsius * 1.8 + 32;
        System.out.println("a temperatura em fare e: " + fare);

        
    }
}