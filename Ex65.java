import java.util.Scanner;

class Ex65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar (US$): ");
        double cotacao = scan.nextDouble();
        double[] vetorA = new double[20];

        for (int i = 0; i < 20; i++) {
            
            vetorA[i] = cotacao * (i + 1);
        }

        for (int i = 0; i < 20; i++) {
            System.out.printf("US$ %d = R$ %.2f\n", (i + 1), vetorA[i]);
        }
        scan.close();
    }
}