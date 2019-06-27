package kata.kyu6.MatrixAddition;

public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
  
    int[][] sum = new int[a.length][a.length];
    
      for (int i = 0; i < a.length; i++) {
      
        for (int j = 0; j < a[i].length; j++) {
        
          sum[i][j] = a[i][j] + b[i][j];
        }
      }
      
		return sum;
	}
}
