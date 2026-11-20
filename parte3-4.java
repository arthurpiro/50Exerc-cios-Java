public class exercicio4 {
    public static void main(String[] args) {

        float popuA = 80000;
        float popuB = 200000;
        int anos = 0;

        while (popA < popB) {
            popuA = popuA + (popuA * 0.03f);
            popuB = popuB + (popuB * 0.015f);
            anos = anos + 1;
        }

        System.out.println("Anos necessarios" + " " + anos);
    }
}
