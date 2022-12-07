import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Lab1Task6 {
	
	private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
	private static boolean isBinary(String str){
        return str != null && str.matches("[0-1.]+");
    }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.print("Number of numbers:");
		size = input.nextInt();
		String[] numbers = new String[size] ;
		for(int i =0;i<size;i++)
			numbers[i] = input.next();
		for(int i =0;i<size;i++) {
			int temp;
			if(isNumeric(numbers[i]) == true) {
				temp = Integer.parseInt(numbers[i]);
				System.out.print(temp);
				if(isBinary(numbers[i]) == true)
					System.out.println(" у десятковій є числом " + Integer.parseInt(numbers[i],2));
				else
					System.out.println(" не є числом у двійковій системі числення");
			}
			//System.out.println(numbers[i]);
		}
	
		
	}
}
