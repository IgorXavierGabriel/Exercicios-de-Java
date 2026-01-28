import java.util.Scanner;

class Ex03{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int soma1 = numero1 + numero2;
        System.out.println("A soma dos numero são: " + soma1);

        
    }
}