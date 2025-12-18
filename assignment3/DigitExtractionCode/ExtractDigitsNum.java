import java.util.Scanner;
class ExtractDigitsNum{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number:  ");
	int n=sc.nextInt();
	int digit=0;
	while(n>0){
		int rem=n%10;
		digit=digit*10+rem;
		n=n/10;
		}
		
	while(digit>0){
		int rem=digit%10;
		System.out.print(rem+" ");
		digit=digit/10;
		}
	
	
}	
}