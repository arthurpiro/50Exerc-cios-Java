import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String Turno;

        System.out.println("qual turno voce estuda [manha] [tarde] [noite]");
        Turno= ler.nextLine();

        if(Turno.equals("manha")){
            System.err.println("Bom dia");
        } else if( Turno.equals("tarde")){
            System.out.println("Boa tarde");
        } else if (Turno.equals("noite")){
            System.out.println("Boa noite");
        } else{
            System.out.println("Turno invalido");
        }
        

        ler.close();
    }
}
