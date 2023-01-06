public class Vet {
    public static void main(String arg[]) {
        int larg = 30;
        int vtr[] = new int[larg];
        System.out.println("O tamanho do vetor eh: " + vtr.length);
        int cont = 0;
        for (int i = 0; i < vtr.length; i++) {
            cont = cont + 2;
            vtr[i] = cont;
        }
        for (int i = 0; i < vtr.length; i++) {
            System.out.println("Vetor no local " + i + " tem valor " + vtr[i]);
        }
    }
}