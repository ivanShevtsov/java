import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Lab1Task4 {
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m ,n ;  
		
		System.out.print("Number of rows:");  
		n = input.nextInt();
		System.out.print("Number of columns:");  
		m = input.nextInt();
		int[][] matrix = new int[n][m];
		int[][] matrixResult = new int[n][m];
		int[] modsum = new int[m];
		int[][] tempcol = new int[n][1];
		for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			matrix[i][j] = (int) (Math.random()*100 - 50 );
		}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
			}
		System.out.println();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if ( matrix[j][i] % 2 != 0 && matrix[j][i] < 0)
					modsum[i] = modsum[i] + Math.abs(matrix[j][i]);
				}}
		for(int j=0;j<m;j++) {
			System.out.print(modsum[j]+ " ");
		}
		System.out.println();
		for(int j=1;j<m;j++) {
			if(modsum[j]<modsum[j-1]) {
				int temp = modsum[j-1];
				modsum[j-1] = modsum[j];
				modsum[j]=temp;
				for(int i = 0;i<n;i++) {
					tempcol[i][0] = matrix[i][j-1];
					matrix[i][j-1] = matrix[i][j];
					matrix[i][j]= tempcol[i][0];
				}
			}
		}
		for(int j=0;j<m;j++) {
			System.out.print(modsum[j]+ " ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
			}
	
		
	}
}
