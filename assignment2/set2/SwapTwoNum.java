import java.util.Scanner;
class SwapTwoNum{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number:");
	int m=sc.nextInt();
	System.out.print("Enter number:");
	int n=sc.nextInt();
	System.out.println("Before Swap: "+m+" "+n);
	int i=m;
	m=n;
	n=i;
	System.out.println("After Swap: "+m+" "+n);
}
}