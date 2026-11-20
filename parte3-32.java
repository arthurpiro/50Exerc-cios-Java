import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1;
        int cont;
        int fatorial = 1;

        System.out.println("Fatorial de:");
        num1 = ler.nextInt();

        System.out.print(num1 + "! = ");
        cont = num1;
        while (cont >= 1) {
            fatorial = fatorial * cont;
            System.out.print(cont);
            if (cont > 1) {
                System.out.print(" . ");
            }
            cont = cont - 1;
        }

        System.out.println(" = " + fatorial);

        ler.close();
    }
}
