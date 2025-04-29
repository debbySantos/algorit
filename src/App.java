import java.util.Scanner;

public class App {
    public static String obterNome() {
        System.out.println("App.obterNome()");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = input.nextLine();
        return nome;
    }

    public static float nota() {
        System.out.println("App.nota()");

        Scanner input = new Scanner(System.in);
        float nota = input.nextFloat();
        return nota;
    }

    public static float calculoMedia(float nota1, float nota2, float nota3) {
        System.out.println("App.calculoMedia()");

        float media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public static char conceito(float media) {
        System.out.println("App.conceito()");
        char conceito;
        if (media >= 9 && media <= 10) {
            conceito = 'A';
        } else if (media >= 8 && media < 9) {
            conceito = 'B';
        } else if (media >= 7 && media < 8) {
            conceito = 'C';
        } else if (media >= 6 && media < 7) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        return conceito;
    }

    public static String status(char conceito) {
        System.out.println("App.status()");

        String status = "";
        switch (conceito) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                status = "Aprovado!";
                break;
            case 'E':
                status = "Reprovado!";

        }
        return status;
    }

    // imprimir != retornar

    public static void imprimirDados(String nome, float media, char conceito, String status) {
        System.out.println("App.imprimirDados()");

        System.out.printf(" Aluno: %s \n Media: %.2f \n Conceito: %c \n Status: %s \n", nome, media, conceito, status);

    }

    public static void main(String[] args) throws Exception {
        String nome = obterNome();
        float nota1 = nota();
        float nota2 = nota();
        float nota3 = nota();
        float media = calculoMedia(nota1, nota2, nota3);
        char conceito = conceito(media);
        String status = status(conceito);
        imprimirDados(nome, media, conceito, status);
    }
}
