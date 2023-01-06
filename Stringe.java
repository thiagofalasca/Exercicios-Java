public class Stringe {
    public static void main(String arg[]) {
        String frase = "Frase de teste!";
        System.out.println("\n\tFrase de teste!");
        System.out.println("\nA frase anterior tem " + frase.length() + " caracteres");
        System.out.println("\nTransformando-a toda em MAIUSCULA:");
        System.out.print(frase.toUpperCase());
        System.out.println("\n\nTRANSFORMANDO-A TODA EM minuscula:");
        System.out.print(frase.toLowerCase());
        System.out.println("\n\nProcurando a letra da 10 posição:");
        System.out.print(frase.charAt(13));
        System.out.println("\n\nRetornando a substring dentro da frase:");
        System.out.println(frase.substring(0, 5));
        System.out.println("\n1ª Vez que encontrou a letra 't' na frase:");
        System.out.println(frase.indexOf('t'));
        System.out.println("\nTirando os espaços em branco:");
        System.out.println(frase.trim());
        System.out.println("\nTrocando as letras 's' por 'S':");
        System.out.println(frase.replace('s', 'S'));
    }
}