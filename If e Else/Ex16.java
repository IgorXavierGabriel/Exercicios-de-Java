import java.util.Scanner;

class Ex16 { public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = scan.nextDouble();
        if (a != 0) {
            System.out.println("Digite o valor de b:");
            double b = scan.nextDouble();
            System.out.println("Digite o valor de c:");
            double c = scan.nextDouble();
            double delta = (b*b) - (4*a*c);
            double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
            if (delta < 0) {
                System.out.println("A equação não possui raizes reais");
            }else if (delta == 0) { 
                System.out.printf("So possui uma raiz real: %.2f%n" , raiz2);

            } else if (delta > 0) {
                System.out.printf("Equação possoui duas raizes reais: %.2f e %.2f%n" , raiz1 ,  raiz2);
            }

          
            
         } else System.out.println("Essa não e uma equação de segundo grau");
            
        

       
        
        scan.close();
    }
}