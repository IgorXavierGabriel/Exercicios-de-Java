import java.util.Scanner;

class Ex36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero para ter seu fatorial: ");
        int num = scan.nextInt();
        
        // O 'balde' começa em 1 (se começar em 0, o resultado será sempre 0)
        long resultado = 1; 

        System.out.print(num + "! = ");

        // O loop vai do número escolhido até o 1
        for (int i = num; i >= 1; i--) {
            resultado = resultado * i; // Acumula a multiplicação
            
            // Apenas para deixar o visual bonito (ex: 5 . 4 . 3 . 2 . 1)
            System.out.print(i + (i > 1 ? " . " : ""));
        }

        System.out.println(" = " + resultado);
        scan.close();
    }
}
