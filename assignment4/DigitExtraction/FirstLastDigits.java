import java.util.*;
class FirstLastDigits{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int rem=0;
	int lastrem=n%10;
	while(n>0){
		 rem=n%10;
		n=n/10;
		}
	
	System.out.println("First Digit: "+rem);
	System.out.println("Last Digit: "+lastrem);
	
	}
}