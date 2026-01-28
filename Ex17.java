import java.util.Scanner;

class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho da área em metros quadrados: ");
        double area = scan.nextDouble();

        // 1 litro para cada 6 metros. Acrescentamos 10% de folga.
        double litrosNecessarios = (area / 6) * 1.1;

        // SITUAÇÃO 1: Apenas latas de 18 litros (R$ 80,00)
        double latasApenas = Math.ceil(litrosNecessarios / 18);
        double precoLatas = latasApenas * 80;

        // SITUAÇÃO 2: Apenas galões de 3,6 litros (R$ 25,00)
        double galoesApenas = Math.ceil(litrosNecessarios / 3.6);
        double precoGaloes = galoesApenas * 25;

        // EXIBIÇÃO
        System.out.println("--- RESULTADOS ---");
        System.out.printf("Apenas Latas: %.0f unidade(s) - R$ %.2f%n", latasApenas, precoLatas);
        System.out.printf("Apenas Galoes: %.0f unidade(s) - R$ %.2f%n", galoesApenas, precoGaloes);
    }
}