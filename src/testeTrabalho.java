import java.util.Scanner;

public class testeTrabalho {
    public static void main(String[] args) {
        int linhas = 6;
        int colunas = 7;
        Scanner sc = new Scanner(System.in);
        char [][] tabuleiro = new char[linhas][colunas];
        inicializarTabuleiro(linhas, colunas, tabuleiro);
        imprimirTabuleiro(linhas, colunas, tabuleiro);
    }
    public static void inicializarTabuleiro(int linhas, int colunas, char [][] tabuleiro) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }
    public static void imprimirTabuleiro(int linhas, int colunas, char [][] tabuleiro) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
