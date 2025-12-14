import java.util.Scanner;
class Facto{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number:");
	int n=sc.nextInt();
	int fact=1;
	while(n>0){
	fact=fact*n;
	n--;
	}
	System.out.print(fact);
 	
}
}