import java.util.Scanner;

class Ex06{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeiro numero inteiro:  ");
        int n1 = scan.nextInt();
        System.out.println("Digite a segundo numero inteiro:  ");
        int n2 = scan.nextInt();
        System.out.println("Digite o terceiro numero inteiro:  ");
        int n3 = scan.nextInt();
        int maior = Math.max(n1, Math.max(n2, n3));
        System.out.println("O maior numero e: " + maior);
        
    
    }
}