import java.util.Scanner;
class LeftPatternNStartNumAdd{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number: ");
	int n=sc.nextInt();
	System.out.print("Enter Started Number: ");
	int m=sc.nextInt();
	int sum=m;

	for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
	
	System.out.print(sum+" ");
	sum++;
	}
	System.out.println();

	}
	}
}