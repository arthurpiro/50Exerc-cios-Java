import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;
        int cont = 1;
        int idade;
        float soma = 0;
        float media;

        System.out.println("Digite a quantidade de pessoas");
        n = ler.nextInt();

        while (cont <= n) {
            System.out.println("Digite a idade da " + cont + " pessoa");
            idade = ler.nextInt();
            soma = soma + idade;
            cont = cont + 1;
        }

        media = soma / n;

        if (media >= 0 && media <= 25) {
            System.out.println("Turma jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("Turma adulta");
        } else {
            System.out.println("Turma idosa");
        }

        ler.close();
    }
}
