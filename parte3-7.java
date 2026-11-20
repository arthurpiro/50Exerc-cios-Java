import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float num4;
        float num5;

        System.out.println("Digite o 1 numero");
        num1 = ler.nextFloat();

        System.out.println("Digite o 2 numero");
        num2 = ler.nextFloat();

        System.out.println("Digite o 3 numero");
        num3 = ler.nextFloat();

        System.out.println("Digite o 4 numero");
        num4 = ler.nextFloat();

        System.out.println("Digite o 5 numero");
        num5 = ler.nextFloat();

        ler.close();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("esse é o maior" + " " + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("esse é o maior" + " " + num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("esse é o maior" + " " + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("esse é o maior" + " " + num4);
        } else {
            System.out.println("esse é o maior" + " " + num5);
        }
    }
}
