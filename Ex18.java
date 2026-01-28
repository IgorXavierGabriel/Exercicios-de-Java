import java.util.Scanner;

class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do arquivo (em MB): ");
        double tamanhoMB = scan.nextDouble();

        System.out.println("Velocidade da internet (em Mbps): ");
        double velocidadeMbps = scan.nextDouble();

        // 1. Converter Mbps para MB/s
        double velocidadeReal = velocidadeMbps / 8;

        // 2. Tempo em segundos
        double tempoSegundos = tamanhoMB / velocidadeReal;

        // 3. Tempo em minutos (arredondado para cima)
        double tempoMinutos = Math.ceil(tempoSegundos / 60);

        System.out.println("O download vai demorar aproximadamente: " + (int)tempoMinutos + " minutos.");
    }
}