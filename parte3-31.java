import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float preco;
        float total;
        float dinheiro;
        float troco;
        int cont;
        int lojaAberta = 1;

        while (lojaAberta == 1) {
            total = 0;
            cont = 1;
            preco = 1;

            System.out.println("Lojas Tabajara");
            while (preco != 0) {
                System.out.println("Produto " + cont + ":");
                preco = ler.nextFloat();
                total = total + preco;
                cont = cont + 1;
            }

            System.out.println("Total: R$ " + total);
            System.out.println("Dinheiro: R$ ");
            dinheiro = ler.nextFloat();

            troco = dinheiro - total;
            System.out.println("Troco: R$ " + troco);
        }

        ler.close();
    }
}
