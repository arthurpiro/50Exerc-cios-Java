import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float nota;

        System.out.println("Digite uma nota entre 0 e 10");
        nota = ler.nextFloat();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor invalido, digite novamente");
            nota = ler.nextFloat();
        }

        System.out.println("Nota valida" + " " + nota);

        ler.close();
    }
}
