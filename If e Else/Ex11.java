import java.util.Scanner;

class Ex11{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salario do trabalhador:  ");
        double salario = scan.nextDouble();
        double reajuste2 = (salario * 0.05);
        double novoSalario1 = reajuste2 + salario;
        if (salario < 280) {
            double reajuste = (salario * 0.20);
            double novoSalario = reajuste + salario;
            System.out.println("o salario antes do reajuste era: " + salario);
            System.out.println(" o percentual de aumento foi de 20%");
            System.out.println("o valor do aumento foi: " + reajuste);
            System.out.println("o novo salario e de " + novoSalario);

            
        }else if (salario >= 280 && salario < 700) {
            double reajuste = (salario * 0.15);
            double novoSalario = reajuste + salario;
            System.out.println("o salario antes do reajuste era: " + salario);
            System.out.println(" o percentual de aumento foi de 15%");
            System.out.println("o valor do aumento foi: " + reajuste);
            System.out.println("o novo salario e de " + novoSalario);
            
        }else if (salario >= 700 && salario < 1500) {
            double reajuste = (salario * 0.1);
            double novoSalario = reajuste + salario;
            System.out.println("o salario antes do reajuste era: " + salario);
            System.out.println(" o percentual de aumento foi de 10%");
            System.out.println("o valor do aumento foi: " + reajuste);
            System.out.println("o novo salario e de " + novoSalario);
      
        
            
        }else System.out.println("o Salario antes do reajuste era: " + salario + " o Porcentual de aumento foi de 5%, o valor do aumento foi " +  reajuste2 +" o novo salarioe  e de " + novoSalario1);
            
        
       
        
    
    }
}
