import java.util.Scanner;

class Ex15{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite quanto voce ganha por hora e o numero total de horas trabalhadas no mes: ");

        double valor = scan.nextDouble();
        double horas = scan.nextDouble();
        double total = (valor * horas) ;
        double renda = (total * 0.11);
        double inss = total *0.08;
        double sindicato = total * 0.05;
        double ganho = total -( inss + sindicato + renda) ;

        System.out.println("voce vai ganhar : " + ganho);

        
    }
}