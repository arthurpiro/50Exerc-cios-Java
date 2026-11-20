import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1;
        int num2;
        int cont;

        System.out.println("Digite o 1 numero");
        num1 = ler.nextInt();

        System.out.println("Digite o 2 numero");
        num2 = ler.nextInt();

        if (num1 < num2) {
            cont = num1 + 1;
            while (cont < num2) {
                System.out.println(cont);
                cont = cont + 1;
            }
        } else {
            cont = num2 + 1;
            while (cont < num1) {
                System.out.println(cont);
                cont = cont + 1;
            }
        }

        ler.close();
    }
}
