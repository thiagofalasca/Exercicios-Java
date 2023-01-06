//Nome: Thiago Falasca Duarte -  RA: 2350670
//Utilizei o Double para calcular a area de um circulo junto com o Math.PI
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExDouble {
    public static void main(String[] args) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";

        System.out.println("Digite o raio do circulo para calcular sua area");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        Double raio = Double.parseDouble(s);

        Double area = raio * raio * Math.PI;

        System.out.format("A area do circulo arredondada e: %.2f", area);
    }
}