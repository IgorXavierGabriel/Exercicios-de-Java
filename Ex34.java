import java.util.Scanner;

class Ex32 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite ate qual termo voce quer gerar Fibonacci: ");
    int termo = scan.nextInt();
    int anterior = 0;
    int atual = 1;
    for( int i = 0; i < termo; i++) {
        System.out.print(atual + " ");


    int proximo = atual + anterior; 
    anterior = atual;               
    atual = proximo;
    }
    scan.close();

    
    }
}