import java.util.Scanner;

class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scan.nextInt();
        if (numero < 1000) {
        int centenas = numero / 100; 
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;
        String resultado = centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades";
        System.out.println(resultado);}
        else System.out.println("Numero invalido");
        
        scan.close();
    }
}