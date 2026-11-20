import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int turmas;
        int cont = 1;
        int alunos;
        float soma = 0;
        float media;

        System.out.println("Digite a quantidade de turmas");
        turmas = ler.nextInt();

        while (cont <= turmas) {
            System.out.println("Digite a quantidade de alunos da turma " + cont);
            alunos = ler.nextInt();

            while (alunos < 0 || alunos > 40) {
                System.out.println("Maximo 40 alunos, digite novamente");
                alunos = ler.nextInt();
            }

            soma = soma + alunos;
            cont = cont + 1;
        }

        media = soma / turmas;
        System.out.println("Media de alunos por turma" + " " + media);

        ler.close();
    }
}
