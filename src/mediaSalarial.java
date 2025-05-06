import java.util.Scanner;


//qtd func <
//popular <
//media
//ler vet
//ler med
//total <


public class mediaSalarial {
    public static int coletarQtdFunc(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionários");
        int qtdFunc = input.nextInt();
        return qtdFunc;
    }


    public static float[] coletarSalarios(int quantidadeFunc){
        Scanner input = new Scanner(System.in);
        float [] salariosFunc = new float[quantidadeFunc];

        for(int i = 0; i < quantidadeFunc; i++){
            System.out.println("Digite o salário do funcionário " + (i+1));
            salariosFunc[i] = input.nextFloat();
        }
        return salariosFunc;
    } 

    public static float calcularTotalSalarios(float[] salariosFunc){
        float totalSalario = 0;

        for(int i = 0; i < salariosFunc.length; i++){
            totalSalario += salariosFunc[i];
        }

        return totalSalario;
    }

    public static float calculoMedia(float total, int quantidade){
        float media = total/quantidade;
        return media;
    }

    public static void imprimirMedia(float media){
        System.out.println("A média é " + media);
    }

    public static void salarioAbaixoDaMediaImprimir(float media, float[] salario, int quantidade){
        for(int i = 0; i < quantidade; i++){
            if(salario[i] < media){
                System.out.printf("O salario %d está abaixo da média sendo ela %.2f e o salário %.2f \n", i, media, salario[i]);
            }

        }
    }

    public static void main(String[] args) {
        int quantidadeFunc = coletarQtdFunc();
        float [] salarios = coletarSalarios(quantidadeFunc);
        float totalSalario = calcularTotalSalarios(salarios);
        float media = calculoMedia(totalSalario, quantidadeFunc);
        imprimirMedia(media);
        salarioAbaixoDaMediaImprimir(media, salarios, quantidadeFunc);
    }



    // public static void main(String[] agrs){
    //     float [] salariosFunc = new float[5];

    //     Scanner input = new Scanner(System.in);

    //     float totalSalario = 0;
        // for(int i = 0; i < salariosFunc.length; i++){
        //     System.out.println("Digite o salário do funcionário " + (i+1));
        //     salariosFunc[i] = input.nextFloat();
        //     totalSalario += salariosFunc[i];
        // }
        
    //     float media = totalSalario / 5;
    //     System.out.println("Média: " + media);

    //     for(int i = 0; i < salariosFunc.length; i++){
    //         if(salariosFunc[i] < media){
    //             System.out.printf("Salário[%d]: %.1f está abaixo da média \n", i, salariosFunc[i]);

    //         }
    //     }


    // }
}
