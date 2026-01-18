import java.util.*;
class ReverseNum{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	
	int rev=0;
	while(n>0){
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
	System.out.println(rev);
	}
}