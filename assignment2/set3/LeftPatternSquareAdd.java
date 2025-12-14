import java.util.Scanner;
class LeftPatternSquareAdd{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter number:");
	int n=sc.nextInt();
	int count=1;
	for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
				System.out.print(count*count+" ");
				count++;
				}
			System.out.println();

			}
}
}