import java.util.*;
class SmallestDigits{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int min=9;
	
	while(n>0){
		int rem=n%10;
		if(rem<min){
			min=rem;
			}
		n=n/10;
		}
	System.out.println(min);
	}
}