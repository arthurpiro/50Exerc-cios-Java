import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float nota5;
        float soma;
        float media;

        System.out.println("Digite o 1 numero");
        nota1 = ler.nextFloat();

        System.out.println("Digite o 2 numero");
        nota2 = ler.nextFloat();

        System.out.println("Digite o 3 numero");
        nota3 = ler.nextFloat();

        System.out.println("Digite o 4 numero");
        nota4 = ler.nextFloat();

        System.out.println("Digite o 5 numero");
        nota5 = ler.nextFloat();

        soma = nota1 + nota2 + nota3 + nota4 + nota5;
        media = soma / 5;

        System.out.println("Soma" + " " + soma);
        System.out.println("Media" + " " + media);

        ler.close();
    }
}
