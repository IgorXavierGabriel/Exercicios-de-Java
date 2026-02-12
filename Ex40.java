import java.util.Scanner;

class Ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mostrar primos entre 1 e : ");
        int n = scan.nextInt();

        int divExecutadas = 0; // Contador de "esforço" do computador

        System.out.println("Números primos encontrados:");

        // Primeiro laço: percorre todos os números de 1 até N
        for (int i = 2; i <= n; i++) {
            int divisores = 0;

            // Segundo laço: verifica se o número 'i' é primo
            for (int j = 1; j <= i; j++) {
                divExecutadas++; // Cada teste de resto conta como uma divisão executada
                if (i % j == 0) {
                    divisores++;
                }
            }

            // Se for primo, imprime na tela
            if (divisores == 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nTotal de divisões executadas: " + divExecutadas);
        scan.close();
    }
}