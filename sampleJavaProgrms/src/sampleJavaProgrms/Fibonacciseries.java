package sampleJavaProgrms;
/*********************************/
public class Fibonacciseries {
	public static void main(String args[]) {

	int  sum=0;
	int n=20;
	for ( int x=0,y=1;sum<n ;x=y,y=sum,sum=x+y) {
		System.out.print(sum + "  ");
	}
	
	
}
}