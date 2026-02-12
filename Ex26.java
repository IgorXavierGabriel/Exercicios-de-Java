import java.util.Scanner;

class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma;
        double media;

       
        System.out.print("Digite o 1º número: ");
        soma = scan.nextDouble();

        
        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = scan.nextDouble();

           
           soma = num + soma;
           
            
        } 
        media = soma / 5; 
        
        

        System.out.println("a soma dele e igual a: " + soma);
        System.out.println("a media deles e: " + media);
        scan.close();
    }
}