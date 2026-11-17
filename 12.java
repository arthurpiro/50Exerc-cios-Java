import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float valorHora;
        float horasTrabalhadas;
        float salarioBruto;
        float percentualIR;
        float descontoIR;
        float descontoINSS;
        float fgts;
        float totalDescontos;
        float salarioLiquido;

        System.out.println("Digite o valor da sua hora");
        valorHora = ler.nextFloat();

        System.out.println("Digite a quantidade de horas trabalhadas no mês");
        horasTrabalhadas = ler.nextFloat();

        salarioBruto = valorHora * horasTrabalhadas;

        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto <= 2500) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        descontoIR = salarioBruto * (percentualIR / 100);
        descontoINSS = salarioBruto * 0.10f;
        fgts = salarioBruto * 0.11f;
        totalDescontos = descontoIR + descontoINSS;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + ") : R$ " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%) : R$ " + descontoIR);
        System.out.println("(-) INSS (10%) : R$ " + descontoINSS);
        System.out.println("FGTS (11%) : R$ " + fgts);
        System.out.println("Total de descontos : R$ " + totalDescontos);
        System.out.println("Salário Líquido : R$ " + salarioLiquido);

        ler.close();
    }
}
