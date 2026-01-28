import java.util.Scanner;

class Ex07{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio: ");

        double raio = scan.nextDouble();
        double area = (raio*raio * 3.14159) * 2;
        System.out.println("O dobro da area e: " + area);

        
    }
}