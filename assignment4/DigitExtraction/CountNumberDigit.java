import java.util.*;
class CountNumberDigit{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int count=0;
	while(n>0){
		count++;
		n=n/10;
		}
	System.out.println(count);
	}
}