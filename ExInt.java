//Nome: Thiago Falasca Duarte -  RA: 2350670
//Neste código utilizo o Integer com a função max para encontrar o maior inteiro
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExInt {

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

        int a = Integer.parseInt(ExInt.leitura("Entre com o primeiro valor"));
        int b = Integer.parseInt(ExInt.leitura("Entre com o segundo valor"));
        Integer max = Integer.max(a, b);

        System.out.println("O maior numero e o: "+ max);
    }
}
