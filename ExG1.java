//Nome: Thiago Falasca Duarte -  RA: 2350670
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExG1 {
    public static void main(String arg[]) {

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";

        System.out.println("Entre com o primeiro valor: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int a = Integer.parseInt(s);

        System.out.println("Entre com o segundo valor: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int b = Integer.parseInt(s);

        System.out.println("\n\tMENU DE OPCOES\n");
        System.out.println("1 - Somar");
        System.out.println("2 - multiplicar");
        System.out.println("3 - subtrair");
        System.out.println("4 - dividir");
        System.out.println("Escolha uma opcao: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int x = Integer.parseInt(s);

        switch (x) {
            case 1:
                System.out.println("O resultado da soma e: " + (a + b));
                break;
            case 2:
                System.out.println("O resultado da multipicacao e: " + a * b);
                break;
            case 3:
                System.out.println("O resultado da subtracao e: " + (a - b));
                break;
            case 4:
                System.out.println("O resultado da divisao e: " + a / b);
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
}
