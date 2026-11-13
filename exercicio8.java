import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float preco;
        float preco1;
        float preco2;

        System.out.println("Digite o preço do 1° item: ");
        preco= ler.nextFloat();

        System.out.println("Digite o preço do 2° item: ");
        preco1= ler.nextFloat();

        System.out.println("Digite o preço do 3° item: ");
        preco2= ler.nextFloat();

        ler.close();

        if (preco < preco1 && preco < preco2) {
            System.out.println("Esse é mais barato e voce deve comprar esse aquui"+ " "+preco);
        } else if (preco1< preco && preco1 < preco2) {
            System.out.println("Esse é mais barato e voce deve comprar esse aquui"+ " "+preco1);
        } else {
            System.out.println("Esse é mais barato e voce deve comprar esse aquui"+ " "+preco2);
        }

    }

}
