import java.util.Scanner;
class SquareFirst10Num{
	public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Fisrt number:");
	int m=sc.nextInt();
	System.out.println("Enter Last number:");
	int n=sc.nextInt();
	while(m<=n){
	System.out.println("Square of "+m+": "+m*m);
	m++;
	}
}
}