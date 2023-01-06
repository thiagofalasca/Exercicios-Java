
//Nome: Thiago Falasca Duarte -  RA: 2350670
//Utilizei o Short para armazenar um numero e ver se ele é par ou impar.
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExShort {
    public static void main(String[] args) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        Short sh;

        System.out.println("Digite um numero para ver se ele e par!");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        sh = Short.parseShort(s);

        if (sh % 2 == 0)
            System.out.println("O numero e par!");
        else
            System.out.println("O numero e impar!");

    }
}