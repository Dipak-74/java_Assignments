
import java.util.Scanner;
class EvenNum{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number:");
	int n=sc.nextInt();
	if(n%2==0){
	System.out.println(n+" is a Even number");
	
}
	
	else{
	System.out.println(n+" is a Odd number");
	}


}
}