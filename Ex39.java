import java.util.Scanner;

class Ex21_Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();

        int totalDivisores = 0;
        String divisores = ""; // Criamos uma frase para guardar os divisores

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                totalDivisores++;
                divisores += i + " "; // Guarda o número que dividiu certinho
            }
        }

        if (totalDivisores == 2) {
            System.out.println(num + " é PRIMO.");
        } else {
            System.out.println(num + " NÃO é primo.");
            System.out.println("Ele é divisível por: " + divisores);
        }

        scan.close();
    }
}