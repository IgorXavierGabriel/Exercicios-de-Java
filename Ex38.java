import java.util.Scanner;

class Ex38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();

        int totalDivisores = 0;

        // Testamos todos os números de 1 até o próprio 'num'
        for (int i = 1; i <= num; i++) {
            // Se o resto da divisão for zero, i é um divisor
            if (num % i == 0) {
                totalDivisores++;
            }
        }

        // Decisão final baseada na contagem
        if (totalDivisores == 2) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        scan.close();
    }
}