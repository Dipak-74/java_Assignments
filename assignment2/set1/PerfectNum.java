import java.util.Scanner;
class PerfectNum{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number:");
	int n=sc.nextInt();
	System.out.print("Perfect Divisors of "+n+" are: ");

	for(int i=1;i<=n;i++){
	if(n%i==0){
		if(i!=1 && i!=n){
			System.out.print(i+" ");
				}
		}
	

	}
}
}