//Nome: Thiago Falasca Duarte -  RA: 2350670
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz1 {
    public static void main(String[] args) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        int larg = 5;
        int vtr[] = new int[larg];
        System.out.println("Digite os valores do vetor");
        for (int i = 0; i < larg; i++) {
            try {
                s = cd.readLine();
            } catch (IOException e) {
                System.out.println("Erro de entrada");
            }
            vtr[i] = Integer.parseInt(s);
        }
        for (int i = 1; i <= larg; i++) {
            System.out.println("["+vtr[larg-i]+"]");
        }
    }
}