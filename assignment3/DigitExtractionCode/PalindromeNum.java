import java.util.Scanner;
class PalindromeNum{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int Original=n;
	int Reverse=0;
	while(n>0){
		int rem=n%10;
		Reverse=Reverse*10+rem;
		n=n/10;
		}
	if(Original==Reverse){
	System.out.println("Output: Palindrome");			
		}
	else{System.out.println("Output: Not Palindrome");	
}	}
}