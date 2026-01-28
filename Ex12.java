import java.util.Scanner;

class Ex12{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura: ");

    
        double altura = scan.nextDouble();
        double resultado = 72.7 * altura - 58;
        System.out.println("seu peso idela e:" + resultado);
        

        
    }
}