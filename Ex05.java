import java.util.Scanner;

class Ex05{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros: ");

        double metro = scan.nextDouble();
        double centi = metro * 100;
        System.out.println("A medida de metros em centimetro e: " + centi);

        
    }
}