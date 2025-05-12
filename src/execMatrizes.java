public class execMatrizes {
	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Item: " + matriz[2][2]);

		matriz[2][2] = 90;
		
		System.out.println("Item: " + matriz[2][2]);
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Item " + matriz[i][j]);
			}
		}

	}
}



