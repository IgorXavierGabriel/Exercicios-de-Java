import java.util.Scanner;

class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a data (dd/mm/aaaa): ");
        String entrada = scan.next();
        
        // Separando a string usando a barra como divisor
        String[] partes = entrada.split("/");
        
        if (partes.length != 3) {
            System.out.println("Formato inválido! Use dd/mm/aaaa");
            return;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        boolean valida = false;

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                // Fevereiro: checa bissexto
                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                if (bissexto && dia <= 29) valida = true;
                else if (!bissexto && dia <= 28) valida = true;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                // Meses de 30 dias
                if (dia <= 30) valida = true;
            } else {
                // Meses de 31 dias
                if (dia <= 31) valida = true;
            }
        }

        // Dia não pode ser menor que 1
        if (dia <= 0) valida = false;

        if (valida) {
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }
    }
}