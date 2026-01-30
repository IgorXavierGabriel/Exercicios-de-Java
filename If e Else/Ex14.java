import java.util.Scanner;

class Ex14{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota:  ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota:  ");
        double nota2 = scan.nextDouble();
        double media =  (nota1 + nota2) /2;
        if (media >= 9 && media <= 10.0) {
            System.out.println(" o seu conceito foi A e sua media foi: " + media + "   APROVADO");
            
        } else if (media >= 7.5 ) {
            System.out.println(" o seu conceito foi B e sua media foi: " + media + "   APROVADO");
            
        } else if (media >= 6 ){
             System.out.println(" o seu conceito foi C e sua media foi: " + media + "  APROVADO");
        } else if (media >= 4 ) {
            System.out.println(" o seu conceito foi D e sua media foi: " + media + "   REPROVADO");
            
        }else if (media >= 0 ) {
            System.out.println(" o seu conceito foi E e sua media foi: " + media + "   REPROVADO");
       
        } else System.out.println("Dados incorretos");
        scan.close();
       
    }}
