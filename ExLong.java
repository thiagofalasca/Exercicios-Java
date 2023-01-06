//Nome: Thiago Falasca Duarte -  RA: 2350670
//Utilizo o Long para multiplicar 2 numeros
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExLong {

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
       
        Long l = Long.parseLong(ExLong.leitura("Entre com o primeiro valor da multiplicacao"));
        Long l2 = Long.parseLong(ExLong.leitura("Entre com o segundo valor da multiplicacao"));

        System.out.println("O produto dos 2 numeros e: "+ l * l2);
    }
}