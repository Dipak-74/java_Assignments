import java.util.Scanner;
class TwoNumMax{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number:");
	int m=sc.nextInt();
	System.out.print("Enter number:");
	int n=sc.nextInt();
	
	if(m>n){
		System.out.println("Maximum = "+m);
		}
	else{System.out.println("Maximum = "+n);
}
}
}