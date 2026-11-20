import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int base;
        int expoente;
        int cont = 1;
        int resultado = 1;

        System.out.println("Digite a base");
        base = ler.nextInt();

        System.out.println("Digite o expoente");
        expoente = ler.nextInt();

        while (cont <= expoente) {
            resultado = resultado * base;
            cont = cont + 1;
        }

        System.out.println("Resultado" + " " + resultado);

        ler.close();
    }
}
