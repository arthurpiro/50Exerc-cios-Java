import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float media;

        System.out.println("Digite a primeir nota");
        nota1 = ler.nextFloat();

        System.out.println("Digite a segunda nota");
        nota2 = ler.nextFloat();

        System.out.println("Digite a terceira nota");
        nota3 = ler.nextFloat();

        media= nota1+nota2+nota3/3;
        
        

        if (media >=7) {
            System.out.println("A nota do aluno é de: "+ media +"e  ele esta Aprovado");
            
        } else if(media<7){
            System.out.println("A nota do aluno é de: "+ media +"e  ele esta Reprovado");
        } else if(media ==10){
            System.out.println("A nota do aluno é de: "+ media+"e  ele esta Aprovado com Distinção");



        ler.close();

    }

}
}
