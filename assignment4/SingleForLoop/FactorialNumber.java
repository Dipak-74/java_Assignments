import java.util.*;
class FactorialNumber{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int fact=1;
	for(int i=n;i>=1;i--){
		fact=fact*i;
		}
	System.out.println(fact);
	}
}