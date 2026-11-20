import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float populaA;
        float populaB;
        float taxaA;
        float taxaB;
        int anos;
        String repetir = "s";

        while (repetir.equals("s")) {
            anos = 0;

            System.out.println("Digite a populacao A");
            populaA = ler.nextFloat();
            while (populaA <= 0) {
                System.out.println("Valor invalido, digite novamente");
                populaA = ler.nextFloat();
            }

            System.out.println("Digite a taxa A");
            taxaA = ler.nextFloat();
            while (taxaA <= 0) {
                System.out.println("Valor invalido, digite novamente");
                taxaA = ler.nextFloat();
            }

            System.out.println("Digite a populacao B");
            populaB = ler.nextFloat();
            while (populaB <= 0) {
                System.out.println("Valor invalido, digite novamente");
                populaB = ler.nextFloat();
            }

            System.out.println("Digite a taxa B");
            taxaB = ler.nextFloat();
            while (taxaB <= 0) {
                System.out.println("Valor invalido, digite novamente");
                taxaB = ler.nextFloat();
            }

            while (populaA < populaB) {
                populaA = populaA + (populaA * (taxaA / 100));
                populaB = populaB + (populaB * (taxaB / 100));
                anos = anos + 1;
            }

            System.out.println("Anos necessarios" + " " + anos);
            ler.nextLine();
            System.out.println("Deseja repetir [s] [n]");
            repetir = ler.nextLine();
        }
        ler.close();
    }
}
