import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String Resposta= ler.nextLine();
       

        if(Resposta.equals("a")||Resposta.equals("e")||Resposta.equals("i")||Resposta.equals("o")||Resposta.equals("u")){
            System.out.println("é vogal");
        
        }else  {
            System.out.println("é consoante");
        }

        ler.close();

    }

}