import java.util.Scanner;

public class TrabalhoFinal{
    public static void main(String[] args) {
        
        char [][] matriz = new char[6][7];
        Scanner sc = new Scanner(System.in);
        tabuleiro(sc, matriz);
}
    public static void tabuleiro(Scanner sc, char [][] matriz){
        for(int j = 0; j < matriz.length; j++){
            for(int i = 0; i < matriz.length; i++){
                matriz[i][j] = 'B';
            }
        }

        System.out.println();
        escrever(sc, matriz);
    
    
    }
    public static void escrever(Scanner sc, char [][] matriz){
        for(int j = 0; j < 7; j++){
            for(int i = 0; i < 6; i++){
                if(j <= 8){
                System.out.print(matriz[i][j]+" ");
                break;
                }
            }
        }
    }
}

