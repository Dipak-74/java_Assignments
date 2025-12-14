
import java.util.Scanner;
class AddSub{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number:");
	int m=sc.nextInt();
	System.out.println("Enter Second number:");
	int n=sc.nextInt();
	System.out.println("Addition: "+(m+n));
	if(m<n){
	System.out.println("Substract: "+(n-m));
}
	else{System.out.println("Substract: "+(m-n));}
}
}