public class Mat {
    public static void main(String arg[]) {
        int lin = 5, col = 5, cont = 1, i = 0, c = 0;
        int mtrz[][] = new int[lin][col];
        System.out.println(mtrz.length); // tamanho da matriz
        for (i = 0; i < lin; i++) {
            for (c = 0; c < col; c++) {
                mtrz[i][c] = cont++;
            }
        }
        for (i = 0; i < lin; i++) {
            for (c = 0; c < col; c++) {
                System.out.println("Val. da " + i + "linha eh " + c + "coluna eh: " + mtrz[i][c]);
            }
        }
    }
}