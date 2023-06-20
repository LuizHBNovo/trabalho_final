import java.util.Scanner;

public class TrabalhoFinal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] matriz = new String[7][7];
        System.out.println("Escolha a sua cor: V(Vermelho)/A(azul)");
        String cor = sc.next();        
        Ler(matriz, sc, cor);
        jogada(matriz, sc, cor);
        escrever(matriz, sc, cor);
        System.out.println();
    }
    
    public static void Ler(String [] [] matriz, Scanner sc, String cor){
        for(int j = 0; j<matriz.length; j++){
        for(int i = 0; i<matriz.length;i++){
        matriz[i][j] = "B ";
        }
    }
    for(int c = 0; c < 6;c++){
    System.out.println();
    escrever(matriz, sc,cor);
    }
    }
    public static void escrever(String [] [] matriz, Scanner sc, String cor){
        for(int j = 0; j<matriz.length; j++){
        for(int i = 0; i<matriz.length;i++){
            if(i <= 8){
            System.out.print(matriz[i][j]);
            break;
            }
        }
    }
    }
    public static void jogada(String [] [] matriz, Scanner sc, String cor){
        for(int j = 0; j<1; j++){   
            for(int i = 0; i<1; i++){
            System.out.println("jogador informe a coluna que vai jogar:");
            j = sc.nextInt();
            j=j-1;
            matriz[i][j] = cor+" ";
            System.out.println("Computador esta fazendo a jogada");
            j = sc.nextInt();
            j=j-1;
            matriz[i][j] = "o ";
        }
        }
    }
}
