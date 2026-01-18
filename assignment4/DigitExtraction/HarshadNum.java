import java.util.*;
class HarshadNum{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int m=n;
	int sum=0;

	while(m>0){
		int rem=m%10;
		sum+=rem;
		m=m/10;
		}
	if(n%sum==0){
		System.out.println("Harshad Number");
		}
	else{System.out.println("Not Harshad Number");}	
	}
}