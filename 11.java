import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float salarioAtual;
        float percentual;
        float valorAumento;
        float novoSalario;

        System.out.println("Digite o salário atual do colaborador");
        salarioAtual = ler.nextFloat();

        if (salarioAtual <= 280.00f) {
            percentual = 20;
        } else if (salarioAtual <= 700.00f) {
            percentual = 15;
        } else if (salarioAtual <= 1500.00f) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        valorAumento = salarioAtual * (percentual / 100);
        novoSalario = salarioAtual + valorAumento;

        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário, após o aumento: R$ " + novoSalario);

        ler.close();
    }
}
