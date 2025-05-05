

public class arrayJavaAula01 {
    public static void main(String[] args){
        int[] vetor = new int[5];

        //populando o vetor

        vetor[0] = 5;
        vetor[1] = 7;
        vetor[2] = -3;
        vetor[3] = 10;
        vetor[4] = -1;

        System.out.println("vetor[2]: " + vetor[2]);
        System.out.println("vetor[4]: " + vetor[4]);
        System.out.println(vetor); //endereço de memória onde o vetor está alocado 

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println("Vetor " + i + " = " + vetor[i]);
            }
        }

        //alteração de vetor
        vetor[4] = 1000;

        System.out.println(vetor[4]);
    }
}
