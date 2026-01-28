import java.util.Scanner;

class Ex06{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio: ");

        double raio = scan.nextDouble();
        double area = raio*raio * 3.14159;
        System.out.println("A area do circulo e: " + area);

        
    }
}