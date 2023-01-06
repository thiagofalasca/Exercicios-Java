//Nome: Thiago Falasca Duarte -  RA: 2350670
//Utilizei o Character para armazenar uma letra, transformada sempre em maiúscula e escrever o nivel de conhecimento a partir de um switch case.
//Fonte: Alura
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExChar {
    public static void main(String[] args) {
        InputStreamReader cl = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(cl);
        Character c = ' ';

        System.out.println("\tDigite o nivel de conhecimento em java");
        System.out.println("A - Conhecimento Pleno");
        System.out.println("B - Conhecimento Avancado");
        System.out.println("C - Conhecimento Intermediario");
        System.out.println("D - Conhecimento Basico");
        System.out.println("E - Conhecimento Zero");

        try {
            c = cd.readLine().charAt(0);
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        c = Character.toUpperCase(c);

        switch (c) {
            case 'A':
                System.out.println("Parabens, voce possui conhecimento pleno!");
                break;
            case 'B':
                System.out.println("Muito bem, voce possui conhecimento avancado!");
                break;
            case 'C':
                System.out.println("Voce possui conhecimento intermediario, ainda pode melhorar!");
                break;
            case 'D':
                System.out.println("Voce esta comecando, continue estudando!");
                break;
            case 'E':
                System.out.println("Voce nao possui conhecimento em Java");
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
}
