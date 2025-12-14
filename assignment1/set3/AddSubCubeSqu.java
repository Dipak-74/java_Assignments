
import java.util.Scanner;
class AddSubCubeSqu{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number:");
	int m=sc.nextInt();
	System.out.println("Enter Second number:");
	int n=sc.nextInt();
	int cubem=m*m*m;
	int cuben=n*n*n;
	int add=cubem+cuben;
	System.out.println("Cubes: "+(add));
	int Squarem=m*m;
	int Squaren=n*n;
	if(m<n){
	int Sub=Squaren-Squarem;
	System.out.println("Square: "+(Sub));
}
	else{
	int Sub=Squarem-Squaren;
	System.out.println("Square "+(Sub));}
}
}