import java.util.Scanner;
public class App {
    public static String obterNome(){
        System.out.println("App.obterNome()");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = input.nextLine();
        return nome;
    }

    public static float nota(){
        System.out.println("App.nota()");

        Scanner input = new Scanner(System.in);
        float nota = input.nextFloat();
        return nota;
    }

    public static float calculoMedia(float nota1, float nota2, float nota3){
        System.out.println("App.calculoMedia()");

        float media = (nota1 + nota2 + nota3)/ 3;
        return media;
    }

    public static char conceito(float media){
        System.out.println("App.conceito()");
        char conceito;
        if(media >= 9){
            conceito = 'A';
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
