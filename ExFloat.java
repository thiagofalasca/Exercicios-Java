//Nome: Thiago Falasca Duarte -  RA: 2350670
//Utilizei o Float para converter as strings em valores float e depois realizar a soma dos mesmos
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExFloat {

    public static String leitura(String s){
        System.out.println(s);
        String s1 = "";
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        try {
            s1 = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        return s1;
    }
    public static void main(String[] args) {

        Float f = Float.parseFloat(ExFloat.leitura("Entre com o primeiro valor da soma"));
        Float f2 = Float.parseFloat(ExFloat.leitura("Entre com o segundo valor da soma"));

        System.out.println("O resultado da soma e: " + Float.sum(f, f2));

    }
}
