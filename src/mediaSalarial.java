import java.util.Scanner;

public class mediaSalarial {
    public static void main(String[] agrs){
        float [] salariosFunc = new float[5];

        Scanner input = new Scanner(System.in);

        float totalSalario = 0;
        for(int i = 0; i < salariosFunc.length; i++){
            System.out.println("Digite o salário do funcionário " + (i+1));
            salariosFunc[i] = input.nextFloat();
            totalSalario += salariosFunc[i];
        }
        
        float media = totalSalario / 5;
        System.out.println("Média: " + media);

        for(int i = 0; i < salariosFunc.length; i++){
            if(salariosFunc[i] < media){
                System.out.printf("Salário[%d]: %.1f está abaixo da média \n", i, salariosFunc[i]);

            }
        }


    }
}
