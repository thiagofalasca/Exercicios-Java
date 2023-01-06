//Nome: Thiago Falasca Duarte -  RA: 2350670
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExH1 {
    public static void main(String arg[]) {

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";

        System.out.println("Entre com um valor: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int x = Integer.parseInt(s);

        if (x % 2 == 0)
            System.out.println("Numero par!");
        else
            System.out.println("Numero impar!"); 
    }
}
