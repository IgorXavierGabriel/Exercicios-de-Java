import java.util.Scanner;

class Ex07{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite quanto voce ganha por hora e o numero total de horas trabalhadas no mes: ");

        double valor = scan.nextDouble();
        double horas = scan.nextDouble();
        double ganho = valor * horas;
        System.out.println("voce vai ganhar : " + ganho);

        
    }
}