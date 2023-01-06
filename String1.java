
//Nome: Thiago Falasca Duarte -  RA: 2350670
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1 {
    public static void main(String arg[]) {

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        String t = "";
        char b;
        int a = 0;

        System.out.println("Digite uma frase");
        try {
            s = cd.readLine().toLowerCase();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }

        System.out.println("Digite uma letra qualquer");
        try {
            t = cd.readLine().toLowerCase();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        b = t.charAt(0);
        if (s.indexOf(b) > -1) {
            System.out.println("A letra aparece nas posicoes: ");
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == b) {
                    System.out.println(i);
                    a++;
                }
            }
            System.out.println("\nA letra aparece " + a + " vez(es) na frase");
        } else {
            System.out.println("\nA letra nao existe na frase!");
        }
    }
}