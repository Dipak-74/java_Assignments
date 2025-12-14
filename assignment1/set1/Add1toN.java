
import java.util.Scanner;
class Add1ToN{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++){
	sum=sum+i;
	
}
 	System.out.println("total sum of first"+n+"Numbers = "+sum);
}
}