import java.util.Scanner;

class Ex08{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeiro preço:  ");
        double n1 = scan.nextDouble();
        System.out.println("Digite a segundo preço:  ");
        double n2 = scan.nextDouble();
        System.out.println("Digite o terceiro preço:  ");
        double n3 = scan.nextDouble();
        double menor = Math.min(n1, Math.min(n2, n3));
        System.out.println("o Produto mas barato e: " + menor);
        
    
    }
}