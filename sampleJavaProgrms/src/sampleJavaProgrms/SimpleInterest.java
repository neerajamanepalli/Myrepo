package sampleJavaProgrms;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String args[]) {
		
		/*FORMULA S=P*N*R/100 */
		
		float p, r, t, interest;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Principal : ");
		p = scan.nextFloat();
		System.out.print("Enter the Rate of interest : ");
		        r = scan.nextFloat();
		        System.out.print("Enter the Time period : ");
		        t = scan.nextFloat();
		        scan.close();
		        interest = (p * r * t) / 100;
		        System.out.print("Simple Interest is: " +interest);
		    }
		
		
	
		
	}
	
	
	
