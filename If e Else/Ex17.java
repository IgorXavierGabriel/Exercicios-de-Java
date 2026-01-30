import java.util.Scanner;

class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano (ex: 2024):");
        int ano = scan.nextInt();

        // Lógica: divisível por 4 E (não divisível por 100 OU divisível por 400)
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto!");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scan.close();
    }
}