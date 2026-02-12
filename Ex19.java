import java.util.Scanner; // 1. Faltava o import

class Ex19 {
    public static void main(String[] args) {
        // 2. Faltava criar o objeto Scanner
        Scanner leitor = new Scanner(System.in); 
        double nota;

        do {
            System.out.print("Digite a nota (0 a 10): ");
            nota = leitor.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");
            }
        } while (nota < 0 || nota > 10); 

        System.out.println("Nota aceita: " + nota);
        
        leitor.close(); // Boa prática fechar o scanner ao final
    }
}