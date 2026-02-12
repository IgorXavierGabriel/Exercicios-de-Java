import java.util.Scanner;

class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantas notas você deseja digitar? ");
        int n = scan.nextInt();
        
        double soma = 0; // Nosso balde para acumular as notas

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scan.nextDouble();
            soma += nota; // soma = soma + nota
        }

        double media = soma / n;
        System.out.printf("A média aritmética das %d notas é: %.2f\n", n, media);
        
        scan.close();
    }
}