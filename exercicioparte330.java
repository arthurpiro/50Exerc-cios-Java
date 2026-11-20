public class exercicio29 {
    public static void main(String[] args) {

        int cont = 1;
        float preco;

        System.out.println("Lojas Quase Dois - Tabela de precos");
        while (cont <= 50) {
            preco = cont * 1.99f;
            System.out.println(cont + " - R$ " + preco);
            cont = cont + 1;
        }
    }
}
