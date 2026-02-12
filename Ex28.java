import java.util.Scanner;

class Intervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Números no intervalo entre " + num1 + " e " + num2 + ":");

        // O loop começa um após o num1 e para antes do num2
        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
