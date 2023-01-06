//Nome: Thiago Falasca Duarte -  RA: 2350670
//Utilizei o Byte para armazenar 2 valores e depois a função compare para ver se sao iguais
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExByte {

    public static String leitura(String s) {
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

        Byte a = Byte.parseByte(ExByte.leitura("Entre com um valor entre -127 e 127"));
        Byte b = Byte.parseByte(ExByte.leitura("Entre com o outro valor entre -127 e 127"));

        if (Byte.compare(a, b) == 0)
            System.out.println("Os valores sao iguais!");
        else
            System.out.println("Os valores sao diferentes!");

    }
}