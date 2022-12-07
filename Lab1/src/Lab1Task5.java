import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Lab1Task5 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("First line:");  
		String a = input.next();
		System.out.print("Second line:");  
		String b = input.next();
		//System.out.print(a);
		//System.out.print(b);
		int l1 = a.length();
		int l2 = b.length();
		for(int i=0;i<l1;i++) {
			for(int j=0;j<l2;j++) {
				if(a.charAt(i) == b.charAt(j)) {
					System.out.print(b.charAt(j));
					System.out.println();
				}
			}
				
		}
	
		
	}
}
