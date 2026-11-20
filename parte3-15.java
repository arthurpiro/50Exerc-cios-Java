import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;
        int cont = 1;
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println("Digite o termo n");
        n = ler.nextInt();

        while (cont <= n) {
            System.out.println(primeiro);
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            cont = cont + 1;
        }

        ler.close();
    }
}
