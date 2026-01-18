import java.util.*;
class MiddleOddDigit{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int m=n;
	int length=0;
	while(m>0){
		
		length++;	
		m=m/10;
		}
	int mid=(length+1)/2;
	int rem=0;
	while(mid>0){
		rem=n%10;
		n=n/10;
		mid--;
		}
	System.out.println(rem);	
	}
}