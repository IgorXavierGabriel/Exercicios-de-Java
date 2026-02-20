import java.util.Scanner;

class Ex62 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int somaMenores = 0;
        int somaMaiores = 0;
        int somaIguais = 0;

        // 1. Entrada de dados
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }

        // 2. Processamento (os "baldes")
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                somaMenores += vetorA[i];
            } else if (vetorA[i] > 15) {
                somaMaiores += vetorA[i];
            } else { // Aqui só sobra o caso de ser igual a 15
                somaIguais += vetorA[i];
            }
        } 

        // 3. Exibição dos resultados finais (FORA dos loops)
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("A soma de números inferiores a 15 é: " + somaMenores);
        System.out.println("A soma de números superiores a 15 é: " + somaMaiores);
        System.out.println("A soma de números iguais a 15 é: " + somaIguais);

        scan.close();
    }
}