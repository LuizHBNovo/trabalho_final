import java.util.Scanner;

public class TrabalhoFinal{
    public static void main(String[] args) {
        
        char [][] matriz = new char[6][7];
        Scanner sc = new Scanner(System.in);
        tabuleiro(sc, matriz);
        escrever(matriz);
        escolherCorJogador(sc);
        realizarJogadaJogador(sc, matriz);
        realizarJogadaComputador(matriz);
}
    public static void tabuleiro(Scanner sc, char [][] matriz){
        for(int j = 0; j < 6; j++){
            for(int i = 0; i < 7; i++){
                matriz[j][i] = 'B';
            }
        }
    }
    public static void escrever(char [][] matriz){
        for(int j = 0; j < 6; j++){
            for(int i = 0; i < 7; i++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void escolherCorJogador(Scanner sc) {
        System.out.println("Escolha sua cor (Vermelho/V) ou (Azul/A):");
        String escolha = sc.nextLine().toUpperCase();

        if (escolha.equals("V")) {
            System.out.println("Você escolheu a cor Vermelho (V). O computador jogará com a cor Azul (A).");
        } else if (escolha.equals("A")) {
            System.out.println("Você escolheu a cor Azul (A). O computador jogará com a cor Vermelho (V).");
        } else {
            System.out.println("Escolha inválida. A cor será definida como Vermelho (V) para o jogador e Azul (A) para o computador.");
        }
    }
    public static void realizarJogadaJogador(Scanner sc, char[][] matriz) {
    System.out.println("Sua vez! Informe a coluna (0-6) para fazer sua jogada:");
    int coluna = sc.nextInt();

    if (coluna < 0 || coluna >= 7) {
        System.out.println("Coluna inválida. Tente novamente.");
        realizarJogadaJogador(sc, matriz);
    } else {
        for (int i = 5; i >= 0; i--) {
            if (matriz[i][coluna] == 'B') {
                matriz[i][coluna] = 'J'; // Marca a posição com a peça do jogador
                break;
            } else if (i == 0) {
                System.out.println("Posição já ocupada. Tente novamente.");
                realizarJogadaJogador(sc, matriz);
            }
        }
        escrever(matriz);;
    }
}
public static void realizarJogadaComputador(char[][] matriz) {
        System.out.println("Vez do computador:");
        int coluna;
        do {
            coluna = (int) (Math.random() * 7); // Gera um número aleatório entre 0 e 6
        } while (!verificarColunaVazia(matriz, coluna));

        for (int i = 5; i >= 0; i--) {
            if (matriz[i][coluna] == 'B') {
                matriz[i][coluna] = 'C'; // Marca a posição com a peça do computador
                break;
            }
        }
        escrever(matriz);;
    }

    public static boolean verificarColunaVazia(char[][] matriz, int coluna) {
        for (int i = 0; i < 6; i++) {
            if (matriz[i][coluna] != 'B') {
                return false; // Coluna não está vazia, posição ocupada
            }
        }
        return true; // Coluna está vazia, posição disponível
    }
}

