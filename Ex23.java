import java.util.Scanner;

class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maior;

        // 1. Lemos o primeiro número fora do loop para ter uma base de comparação
        System.out.print("Digite o 1º número: ");
        maior = scan.nextDouble();

        // 2. Fazemos um loop para os outros 4 números
        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = scan.nextDouble();

            // 3. O duelo: se o número atual for maior que o campeão, ele assume o trono
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        scan.close();
    }
}