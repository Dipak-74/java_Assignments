
import java.util.Scanner;
class MulDiv{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number:");
	int m=sc.nextInt();
	System.out.println("Enter Second number:");
	int n=sc.nextInt();
	System.out.println("Multiplication: "+(m*n));
	if(m<n){
	System.out.println("Division: "+(n/m));
}
	else{System.out.println("Division: "+(m/n));}
}
}