import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o sexo [M] ou [F]");
        String Resposta= ler.nextLine();

        if(Resposta.equals("M")){
            System.out.println("é masculino");
        }
        else if(Resposta.equals("F")){
            System.out.println("é feminino");
        }
        else{
            System.out.println("Genero Invalido");
        }

        ler.close();

    }

}