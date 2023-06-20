import java.util.Scanner;
public class trabalho {

    Scanner sc = new Scanner(System.in);
    public char[][] tabuleiro;
    public int linhas;
    public int colunas;
    public final char jogador1 = 'X';
    public final char jogador2 = 'O';

    public static void inicializarTabuleiro(int linhas, int colunas, char [][] tabuleiro) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                tabuleiro[i][j] = '-';
            }
        }
        imprimirTabuleiro(linhas, colunas, tabuleiro);
    }

    public static void imprimirTabuleiro(int linhas, int colunas, char [][] tabuleiro) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas do tabuleiro: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas do tabuleiro: ");
        int colunas = scanner.nextInt();
        char [][] tabuleiro = new char[linhas][colunas];
       // Lig4Tabuleiro tabuleiro = new (linhas, colunas)
        inicializarTabuleiro(linhas, colunas, tabuleiro);
        // Restante do código
    }
}