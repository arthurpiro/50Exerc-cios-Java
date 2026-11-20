public class exercicio16 {
    public static void main(String[] args) {

        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (proximo <= 500) {
            proximo = primeiro + segundo;
            System.out.println(proximo);
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
