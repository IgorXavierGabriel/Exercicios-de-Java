import java.util.Scanner;

class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        boolean ehPalindromo = true;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor A[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }

       
        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                ehPalindromo = false;
                break; 
        }

        if (ehPalindromo) {
            System.out.println("O vetor é um PALÍNDROMO!");
        } else {
            System.out.println("O vetor NÃO é um palíndromo.");
        }
    }
}}