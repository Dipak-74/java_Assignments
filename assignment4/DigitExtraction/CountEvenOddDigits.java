import java.util.*;
class CountEvenOddDigits{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int evencount=0;
	int oddcount=0;

	while(n>0){
		int rem=n%10;
		if(rem%2==0){
			evencount++;	
			}
		else{oddcount++;}
		n=n/10;
		}
	System.out.println("Even: "+evencount);
	System.out.println("Odd: "+oddcount);
	}
}