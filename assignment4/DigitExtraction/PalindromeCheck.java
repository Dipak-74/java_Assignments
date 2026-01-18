import java.util.*;
class PalindromeCheck{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int m=n;
	int rev=0;
	while(m>0){
		int rem=m%10;
		rev=rev*10+rem;
		m=m/10;
		}
	if(n==rev){
	System.out.println("Palindrome");
		}
	else{System.out.println("Not Palindrome");}
	}
}