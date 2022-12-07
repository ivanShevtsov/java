import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Lab1Task2 {
	
	

	public static void main(String[] args) {
		int n = (int) (Math.random()*50);
		System.out.println(n + "\n");  
		int arr[]= new int[n];
		int even_numbers = 0;
		int num;
		for(int i=0;i<n;i++) {
			arr[i] = (int) (Math.random()*50);
			System.out.println(i + "\t"+ arr[i] + "\n");
		}
		for(int i=1;i<n;i=i+2) {
			 num = arr[i];
			 if ( num % 2 == 0 )
			        even_numbers++ ;
			        
		}
		System.out.println("\n" + even_numbers );
	
		
	}
}
