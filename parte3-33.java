import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float temp;
        float maior = 0;
        float menor = 0;
        float soma = 0;
        float media;
        int cont = 0;
        String repetir = "s";

        while (repetir.equals("s")) {
            System.out.println("Digite a temperatura");
            temp = ler.nextFloat();

            if (cont == 0) {
                maior = temp;
                menor = temp;
            } else {
                if (temp > maior) {
                    maior = temp;
                }
                if (temp < menor) {
                    menor = temp;
                }
            }

            soma = soma + temp;
            cont = cont + 1;

            ler.nextLine();
            System.out.println("Deseja digitar outra temperatura [s] [n]");
            repetir = ler.nextLine();
        }

        media = soma / cont;
        System.out.println("esse é o menor" + " " + menor);
        System.out.println("esse é o maior" + " " + maior);
        System.out.println("Media" + " " + media);

        ler.close();
    }
}
