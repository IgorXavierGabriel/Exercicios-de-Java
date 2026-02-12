import java.util.Scanner;

class Ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a base: ");
        int base = scan.nextInt(); // num1
        
        System.out.println("Digite o expoente: ");
        int limite = scan.nextInt(); // num2
        
        int resultado = 1; // O balde começa em 1

        // O loop roda EXATAMENTE a quantidade de vezes que o limite pedir
        for(int i = 1; i <= limite; i++){
            resultado = resultado * base;  
        }

        System.out.println("O resultado da potência é: " + resultado);
        scan.close();
    }
}