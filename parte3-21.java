import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1;
        int cont = 1;
        int divisores = 0;

        System.out.println("Digite um numero");
        num1 = ler.nextInt();

        while (cont <= num1) {
            if (num1 % cont == 0) {
                divisores = divisores + 1;
            }
            cont = cont + 1;
        }

        if (divisores == 2) {
            System.out.println("O numero e primo");
        } else {
            System.out.println("O numero nao e primo");
        }

        ler.close();
    }
}
