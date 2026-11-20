import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1;
        int cont = 1;
        int resultado;

        System.out.println("Digite o numero da tabuada");
        num1 = ler.nextInt();

        System.out.println("Tabuada de " + num1 + ":");
        while (cont <= 10) {
            resultado = num1 * cont;
            System.out.println(num1 + " X " + cont + " = " + resultado);
            cont = cont + 1;
        }

        ler.close();
    }
}
