import java.util.Scanner;

public class TrabalhoFinal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] matriz = new String[7][7];
        Ler(matriz, sc);
        jogada(matriz, sc);
        char X = 'X';
        char O = 'O';

    }
    public static void Ler(String [] [] matriz, Scanner sc){
        for(int j = 0; j<matriz.length; j++){
        for(int i = 0; i<matriz.length;i++){
        matriz[i][j] = "|";
        }
    }
    for(int c = 0; c < 6;c++){
    System.out.println();
    escrever(matriz, sc);
    }
    }
    public static void escrever(String [] [] matriz, Scanner sc){
        for(int j = 0; j<matriz.length; j++){
        for(int i = 0; i<matriz.length;i++){
            if(j <= 8){
            System.out.print(matriz[i][j]);
            break;
            }
        }
    }
    }
    public static void jogada(String [] [] matriz, Scanner sc){
        for(int j = 0; j<matriz.length; j++){

        }       
    }
}