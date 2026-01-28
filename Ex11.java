import java.util.Scanner;

class Ex11{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros e um real: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double num3 = scan.nextDouble();
        int resultado1 = (num1 * 2) + (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = num3 * num3 * num3;
        System.out.println("O resultado 1 e : " + resultado1);
        System.out.println("O resultado 2 e : " + resultado2);
        System.out.println("O resultado 3 e : " + resultado3);

        
    }
}