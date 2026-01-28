import java.util.Scanner;

class Ex15{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos metros quadrados vai precisar pintar ");

        double quantidade = scan.nextDouble();
        double tinta =  quantidade / 3;
        if (quantidade > 18) {
            double quantidade1 = Math.ceil(quantidade / 18);
            double valor = Math.ceil( quantidade1* 80);
            System.out.println("Voce pintara: " + quantidade +"metros quadrados");
            System.out.println("gastara: " + valor +" Reais");
            System.out.println("E precisa de " + quantidade1 + " de galões de tinta");
            
        }else System.out.println("Voce pintara: " + quantidade +" metros quadrados  Gastara 80 Reais e precisa de 1 galão de tinta");
              
        

        
    }
}