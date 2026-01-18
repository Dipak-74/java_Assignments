import java.util.*;
class PrintDigitsNum{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	while(n>0){
		System.out.println(n%10);
		n=n/10;
		}
	}
}