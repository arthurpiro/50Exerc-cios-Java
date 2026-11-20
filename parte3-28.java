import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int qtd;
        int cont = 1;
        float preco;
        float total = 0;
        float media;

        System.out.println("Digite a quantidade de CDs");
        qtd = ler.nextInt();

        while (cont <= qtd) {
            System.out.println("Digite o valor do " + cont + " CD");
            preco = ler.nextFloat();
            total = total + preco;
            cont = cont + 1;
        }

        media = total / qtd;
        System.out.println("Total investido" + " " + total);
        System.out.println("Valor medio" + " " + media);

        ler.close();
    }
}
