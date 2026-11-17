import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;
        char conceito;

        System.out.println("Digite a 1 nota");
        nota1 = ler.nextFloat();

        System.out.println("Digite a 2 nota");
        nota2 = ler.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media >= 9.0f && media <= 10.0f) {
            conceito = 'A';
        } else if (media >= 7.5f && media < 9.0f) {
            conceito = 'B';
        } else if (media >= 6.0f && media < 7.5f) {
            conceito = 'C';
        } else if (media >= 4.0f && media < 6.0f) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        ler.close();
    }
}
