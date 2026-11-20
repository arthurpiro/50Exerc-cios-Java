import java.util.Scanner;

public class exercicio2 {
    public static void imprimir(int n) {
        int linha = 1;
        int coluna;

        while (linha <= n) {
            coluna = 1;
            while (coluna <= linha) {
                System.out.print(coluna + " ");
                coluna = coluna + 1;
            }
            System.out.println();
            linha = linha + 1;
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Digite o valor de n");
        n = ler.nextInt();

        imprimir(n);

        ler.close();
    }
}
