import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args){

        Scanner ler= new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o valor do numero 1: ");
        num1= ler.nextInt();

        System.out.println("Digite o valor do numero 2: ");
        num2= ler.nextInt();


        if(num1>num2){
            System.out.println(" o numero 1 é o maior");
        }
        if(num2>num1){
            System.out.println(" o numero 2 é o maior");


        }


    }
}