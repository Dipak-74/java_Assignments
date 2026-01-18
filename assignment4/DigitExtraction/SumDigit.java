import java.util.*;
class SumDigit{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int sum=0;
	while(n>0){
		int rem=n%10;
		sum+=rem;
		n=n/10;
		}
	System.out.println(sum);
	}
}