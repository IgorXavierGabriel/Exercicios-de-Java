import java.util.Scanner;

class Ex09{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:  ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero:  ");
        double n2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero:  ");
        double n3 = scan.nextDouble();
        double maior = Math.max(n1, Math.max(n2, n3));
        double menor = Math.max(n1, Math.min(n2, n3));
        double meio = (n1 + n2 + n3) - menor  - maior; 
        System.out.println("Os numeros em ordem decrescente são: " + maior + meio + menor);
            
        }
      
        
        {
        
       }
        
    
    }
