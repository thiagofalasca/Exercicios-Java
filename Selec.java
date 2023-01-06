//Nome: Thiago Falasca Duarte -  RA: 2350670
public class Selec {
    public static void main(String arg[]) {

        int x = Integer.parseInt(arg[0]);
        int y = Integer.parseInt(arg[1]);

        if (x > y)
            System.out.println(("O primeiro e maior que o segundo"));
        else if (x == y)
            System.out.println("O primeiro e igual ao segundo");
        else
            System.out.println(("O primeiro e menor que o segundo"));
    }
}