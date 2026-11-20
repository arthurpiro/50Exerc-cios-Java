import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int qtd;
        int cont = 1;
        float num;
        float maior = 0;
        float menor = 0;
        float soma = 0;

        System.out.println("Quantos numeros deseja digitar");
        qtd = ler.nextInt();

        while (cont <= qtd) {
            System.out.println("Digite o " + cont + " numero entre 0 e 1000");
            num = ler.nextFloat();

            while (num < 0 || num > 1000) {
                System.out.println("Numero invalido, digite entre 0 e 1000");
                num = ler.nextFloat();
            }

            if (cont == 1) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }

            soma = soma + num;
            cont = cont + 1;
        }

        System.out.println("esse é o menor" + " " + menor);
        System.out.println("esse é o maior" + " " + maior);
        System.out.println("soma" + " " + soma);

        ler.close();
    }
}
