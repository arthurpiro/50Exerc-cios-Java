
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;

        System.out.println("Digite o 1 numero");
        nota1= ler.nextFloat();

        System.out.println("Digite o 2 numero");
        nota2= ler.nextFloat();

        System.out.println("Digite o 3 numero");
        nota3= ler.nextFloat();

        ler.close();
        
        if (nota1> nota2 && nota1> nota3){
            System.out.println("esse é o maior"+ " "+ nota1);
           }
        else if (nota2> nota1 && nota2> nota3){
            System.out.println("esse é o maior"+ " "+nota2);
           }
        else  {
            System.out.println("esse é o maior"+" "+ nota3);
           }

        if (nota1<nota2 && nota1< nota3){
            System.out.println("esse é o menor"+ " "+ nota1);
           }
        else if (nota2< nota1 && nota2< nota3){
            System.out.println("esse é o menor"+ " "+nota2);
           }
        else  {
            System.out.println("esse é o menor"+" "+ nota3);
           }
        

    }

}

