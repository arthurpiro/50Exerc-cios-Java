import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1;
        int cont;
        int fatorial = 1;

        System.out.println("Digite um numero");
        num1 = ler.nextInt();

        cont = num1;
        while (cont >= 1) {
            fatorial = fatorial * cont;
            cont = cont - 1;
        }

        System.out.println("Fatorial" + " " + fatorial);

        ler.close();
    }
}
