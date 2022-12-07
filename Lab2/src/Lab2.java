import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Lab2 {
	
	static void arrEnter(int numbers[][],int size) {
		Scanner input = new Scanner(System.in);
		for(int i = 0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print("Enter the number: ");  
				try {
				numbers[i][j]  = input.nextInt();  
				}catch(java.util.InputMismatchException e ) {
					System.out.println("Error , type again :");
					if (input.hasNextInt())
						input.next();
					else {
						String n;
						n = input.next();
						numbers[i][j] = input.nextInt() ;
		            	continue;
					}
			}
		}
		
		}
	}
	static void arrPrint(int numbers[][], int size) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array element number :");
		int num;
		try {
			num = input.nextInt();
			
		}
		catch(java.util.InputMismatchException e ){
			System.out.println("Error");
			if (input.hasNextInt())
				input.next();
			else {
				String n;
				n = input.next();
				num = input.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//String[][] numbers = new String[2][2];
	int size = 2;
	int[][] numbers = new int[size][size]; 
	arrEnter(numbers , size);
	arrPrint(numbers , size);
	
		
	}
}
