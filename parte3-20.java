import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1;
        int cont;
        int fatorial;
        String repetir = "s";

        while (repetir.equals("s")) {
            System.out.println("Digite um numero positivo menor que 16");
            num1 = ler.nextInt();

            while (num1 <= 0 || num1 >= 16) {
                System.out.println("Numero invalido, digite novamente");
                num1 = ler.nextInt();
            }

            fatorial = 1;
            cont = num1;
            while (cont >= 1) {
                fatorial = fatorial * cont;
                cont = cont - 1;
            }

            System.out.println("Fatorial" + " " + fatorial);

            ler.nextLine();
            System.out.println("Deseja repetir [s] [n]");
            repetir = ler.nextLine();
        }

        ler.close();
    }
}
