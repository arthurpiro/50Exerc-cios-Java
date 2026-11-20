import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.println("Digite o usuario");
        usuario = ler.nextLine();

        System.out.println("Digite a senha");
        senha = ler.nextLine();

        while (senha.equals(usuario)) {
            System.out.println("Erro, a senha nao pode ser igual ao usuario");

            System.out.println("Digite o usuario");
            usuario = ler.nextLine();

            System.out.println("Digite a senha");
            senha = ler.nextLine();
        }

        System.out.println("Cadastro realizado");

        ler.close();
    }
}
