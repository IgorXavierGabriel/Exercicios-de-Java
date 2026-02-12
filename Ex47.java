import java.util.Scanner;

class Ex47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lojas Tabajara");
        
        double total = 0;
        double valorProduto;
        int i = 1;

        // Loop que continua enquanto o valor digitado não for 0
        while (true) {
            System.out.print("Produto " + i + ": R$ ");
            valorProduto = scan.nextDouble();

            if (valorProduto == 0) {
                break; // Sai do loop se digitar 0
            }

            total += valorProduto;
            i++;
        }

        System.out.printf("Total: R$ %.2f\n", total);
        
        System.out.print("Dinheiro: R$ ");
        double dinheiro = scan.nextDouble();
        
        double troco = dinheiro - total;
        
        System.out.printf("Troco: R$ %.2f\n", troco);
        System.out.println("-------------------------");
        
        scan.close();
    }
}