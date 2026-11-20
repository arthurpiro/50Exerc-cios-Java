import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;
        int num = 2;
        int cont;
        int divisores;
        int totalDivisoes = 0;

        System.out.println("Digite o valor de N");
        n = ler.nextInt();

        while (num <= n) {
            divisores = 0;
            cont = 1;
            while (cont <= num) {
                totalDivisoes = totalDivisoes + 1;
                if (num % cont == 0) {
                    divisores = divisores + 1;
                }
                cont = cont + 1;
            }
            if (divisores == 2) {
                System.out.println(num);
            }
            num = num + 1;
        }

        System.out.println("Total de divisoes" + " " + totalDivisoes);

        ler.close();
    }
}
