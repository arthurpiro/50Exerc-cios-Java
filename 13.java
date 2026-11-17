import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número de 1 a 7");
        numero = ler.nextInt();

        if (numero == 1) {
            System.out.println("1 - Domingo");
        } else if (numero == 2) {
            System.out.println("2 - Segunda");
        } else if (numero == 3) {
            System.out.println("3 - Terça");
        } else if (numero == 4) {
            System.out.println("4 - Quarta");
        } else if (numero == 5) {
            System.out.println("5 - Quinta");
        } else if (numero == 6) {
            System.out.println("6 - Sexta");
        } else if (numero == 7) {
            System.out.println("7 - Sábado");
        } else {
            System.out.println("Valor inválido");
        }

        ler.close();
    }
}
