
//Nome: Thiago Falasca Duarte -  RA: 2350670
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz2 {
    public static void main(String[] args) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        int lin = 2, col = 3;
        int vtr[][] = new int[lin][col];
        System.out.println("Digite os valores do vetor");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                try {
                    s = cd.readLine();
                } catch (IOException e) {
                    System.out.println("Erro de entrada");
                }
                vtr[i][j] = Integer.parseInt(s);
            }
        }
        for (int i = 1; i <= lin; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.println("[" + vtr[lin - i][col - j] + "]");
            }
        }
    }
}