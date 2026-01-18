import java.util.*;
class ProductofDigits{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int pro=1;
	
	while(n>0){
		int rem=n%10;
		pro=pro*rem;
		n=n/10;
		}
	System.out.println(pro);
	}
}