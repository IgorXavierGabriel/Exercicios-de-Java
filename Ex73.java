import java.util.Random;

class Ex73 {
    public static void main(String[] args) {
        int[][] M = new int[4][4];
        Random gerador = new Random();
        int maior = -1, linhaM = 0, colunaM = 0;

        // Preenchendo e procurando o maior
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                M[linha][coluna] = gerador.nextInt(10); 
                
                if (M[linha][coluna] > maior) {
                    maior = M[linha][coluna];
                    linhaM = linha;
                    colunaM = coluna;
                }
                System.out.print(M[linha][coluna] + " ");
            }
            System.out.println(); 
        }
        System.out.println("\nMaior: " + maior + " em [" + linhaM + "][" + colunaM + "]");
    }
}