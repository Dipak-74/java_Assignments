import java.util.*;
class LargestDigits{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int max=0;
	
	while(n>0){
		int rem=n%10;
		if(rem>max){
			max=rem;
			}
		n=n/10;
		}
	System.out.println(max);
	}
}