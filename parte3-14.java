import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num;
        int cont = 1;
        int pares = 0;
        int impares = 0;

        while (cont <= 10) {
            System.out.println("Digite o " + cont + " numero");
            num = ler.nextInt();

            if (num % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
            cont = cont + 1;
        }

        System.out.println("Pares" + " " + pares);
        System.out.println("Impares" + " " + impares);

        ler.close();
    }
}
