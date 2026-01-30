import java.util.Scanner;

class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o segundo lado:");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado:");
        double lado3 = scan.nextDouble();

        // 1. CONDIÇÃO DE EXISTÊNCIA (A soma de dois lados SEMPRE deve ser maior que o terceiro)
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {

            // 2. CLASSIFICAÇÃO
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } 
            else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triângulo Escaleno");
            } 
            else {
                // Se não é tudo igual e nem tudo diferente, obrigatoriamente é Isósceles
                System.out.println("Triângulo Isósceles");
            }

        } else {
            System.out.println("Não é um triângulo");
        }
        
        scan.close();
    }
}