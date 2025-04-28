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
        
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
