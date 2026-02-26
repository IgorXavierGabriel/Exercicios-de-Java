import java.util.Scanner;

public class Ex77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean jogoAcabou = false;
        char jogadorAtual = 'X'; 

        while (!jogoAcabou) {
            desenharTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", escolha sua posição.");
            
            int linha, coluna;
            while (true) {
                System.out.print("Linha (0-2): ");
                linha = scan.nextInt();
                System.out.print("Coluna (0-2): ");
                coluna = scan.nextInt();

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = jogadorAtual;
                    break;
                } else {
                    System.out.println("Jogada inválida! Tente novamente.");
                }
            }

            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                desenharTabuleiro(tabuleiro);
                System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                break;
            }

            if (tabuleiroCheio(tabuleiro)) {
                desenharTabuleiro(tabuleiro);
                System.out.println("Empate! Deu velha.");
                break;
            }

            // Alternar jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }

    public static void desenharTabuleiro(char[][] tab) {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + (j < 2 ? "|" : ""));
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    public static boolean verificarVencedor(char[][] t, char p) {
        for (int i = 0; i < 3; i++) {
            // Linhas e Colunas
            if ((t[i][0] == p && t[i][1] == p && t[i][2] == p) || 
                (t[0][i] == p && t[1][i] == p && t[2][i] == p)) return true;
        }
        // Diagonais
        return (t[0][0] == p && t[1][1] == p && t[2][2] == p) || 
               (t[0][2] == p && t[1][1] == p && t[2][0] == p);
    }

    public static boolean tabuleiroCheio(char[][] t) {
        for (char[] linha : t) for (char c : linha) if (c == ' ') return false;
        return true;
    }
}