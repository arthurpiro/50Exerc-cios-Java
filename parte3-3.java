import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        float salario;
        String sexo;
        String estadoCivil;

        System.out.println("Digite o nome");
        nome = ler.nextLine();
        while (nome.length() <= 3) {
            System.out.println("Nome invalido, digite novamente");
            nome = ler.nextLine();
        }

        System.out.println("Digite a idade");
        idade = ler.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida, digite novamente");
            idade = ler.nextInt();
        }

        System.out.println("Digite o salario");
        salario = ler.nextFloat();
        while (salario <= 0) {
            System.out.println("Salario invalido, digite novamente");
            salario = ler.nextFloat();
        }

        ler.nextLine();

        System.out.println("Digite o sexo [f] [m]");
        sexo = ler.nextLine();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Sexo invalido, digite novamente");
            sexo = ler.nextLine();
        }

        System.out.println("Digite o estado civil [s] [c] [v] [d]");
        estadoCivil = ler.nextLine();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("Estado civil invalido, digite novamente");
            estadoCivil = ler.nextLine();
        }

        System.out.println("Dados validados");

        ler.close();
    }
}
