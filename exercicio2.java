import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float num;

        System.out.println("Digite um numero");
        num = ler.nextFloat();

        while (num != 0) {
            if (num > 0) {
                System.out.println("O numero é possitivo ");
            } else {
                System.out.println("O numero é negativo ");
            }
            break;
        }

        ler.close();

    }

}
