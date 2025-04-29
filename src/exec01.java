// 1) Desenvolva um programa em Java que solicite o nome e o salário atual de um funcionário. O programa deverá calcular e exibir o novo salário reajustado de acordo com as seguintes regras:

// Salários inferiores a R$ 150,00 recebem um reajuste de 25%.
// Salários entre R$ 150,00 e R$ 300,00 (inclusive) recebem um reajuste de 20%.
// Salários entre R$ 300,00 e R$ 600,00 (inclusive) recebem um reajuste de 15%.
// Salários superiores a R$ 600,00 recebem um reajuste de 10%.
// Além de exibir o novo salário, o programa também deve mostrar a diferença entre o salário reajustado e o salário atual. O programa deve continuar solicitando dados de funcionários até que o usuário digite "FIM" ao ser perguntado pelo nome, momento em que o programa deve ser encerrado. Em caso de informações de salário inválidas (não positivas), o programa deve informar ao usuário.

// Observações:

// Utilize a classe Scanner para obter a entrada do usuário.
// // Implemente métodos separados para obter o nome, x
//  obter o salário, x
//  calcular o reajuste, x 
//   calcular a diferença x e imprimir os resultados.
// O programa deve rodar em um loop contínuo até que a condição de encerramento seja atendida.

import java.util.Scanner;

public class exec01 {
    public static String obterNome() {
        System.out.println("exec01.obterNome()");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = input.nextLine();
        return nome;
    }

    public static float obterSalario() {
        System.out.println("exec01.obterSalario()");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade que você recebe de salário");
        float salario = 0;
        do {
            salario = input.nextFloat();
            if (salario < 0) {
                System.out.println("Valor invalido inserido, insira novamente");
            }
        } while (salario < 0);

        return salario;
    }

    public static float calculoReajuste(float salario, int porcentagemDesconto) {
        System.out.println("exec01.calculoReajuste()");

        float calculo = salario + (salario * ((float) porcentagemDesconto / 100));

        return calculo;

    }

    public static float diferencaCalculo(float calculo, float salario) {
        System.out.println("exec01.diferencaCalculo()");

        float diferenca = calculo - salario;

        return diferenca;
    }

    public static void resultadoImprimir(String nome, float salario, float calculo, float diferenca) {
        System.out.println("exec01.resultadoImprimir()");

        System.out.printf("Olá %s, seu salário era %.2f e foi reajustado para %.2f totalizando %.2f de diferença", nome,
                salario, calculo, diferenca);
    }

    public static void main(String[] agrs) {
        String nome = "";
        do {
            nome = obterNome();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            float salario = obterSalario();
            int porcentagem = 0;
            if (salario < 150.00) {
                porcentagem = 25;
            } else if (salario >= 150 && salario <= 300) {
                porcentagem = 20;
            } else if (salario > 300.1 && salario <= 600) {
                porcentagem = 15;
            } else if (salario > 600) {
                porcentagem = 10;
            }

            float calculo = calculoReajuste(salario, porcentagem);
            float diferencaCalculo = diferencaCalculo(calculo, salario);
            resultadoImprimir(nome, salario, calculo, diferencaCalculo);

        } while (!nome.equalsIgnoreCase("fim"));
    }

}
