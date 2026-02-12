import java.util.Scanner;

class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantas pessoas vão passar a sua idade? ");
        int n = scan.nextInt();
        
        double idadeTotal = 0; // Nosso balde para acumular as notas

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite as idades " + i + ": ");
            double idade = scan.nextDouble();
            idadeTotal += idade; // soma = soma + nota
        }

        double media = idadeTotal / n;

        if (media <= 25) {
            System.out.println("A turma e jovem");
            
        }
        else if (media >= 26 && media < 60) {
            System.out.println("A turma e adulto");
            
        }else System.out.println(" A turma e idosa");
      
        
        scan.close();
    }
}