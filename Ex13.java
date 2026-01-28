import java.util.Scanner;

class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua altura (ex: 1,75): ");
        double altura = scan.nextDouble();
        
        System.out.println("Digite seu sexo (masculino/feminino): ");
        String sexo = scan.next();
        
        if (sexo.equalsIgnoreCase("masculino")) {
            double calculo = 72.7 * altura - 58;
            // %.2f limita a duas casas decimais (ex: 70,50)
            System.out.printf("Seu peso ideal e: %.2f%n", calculo);
            
        } else if (sexo.equalsIgnoreCase("feminino")) {
            double calculo = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal e: %.2f%n", calculo);
            
        } else {
            System.out.println("Opção invalida");
        }
    }
}