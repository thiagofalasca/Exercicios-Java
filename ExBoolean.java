//Nome: Thiago Falasca Duarte -  RA: 2350670
//Utilizo o Boolean para colocar o valor da String em uma variável e imprimi-la
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExBoolean {
    public static void main(String[] args) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        Boolean b1;

        System.out.println("Digite 'true' ou 'false'");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        s = s.toLowerCase();
        b1 = Boolean.parseBoolean(s);

        if (s.equals("true") || s.equals("false"))
            System.out.println("O valor do Booleano 'b1' e: " + b1);
        else
            System.out.println("Escreva um valor valido!");

    }
}