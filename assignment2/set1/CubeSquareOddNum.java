import java.util.Scanner;
class CubeSquareOddNum{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number:");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
	if(i%2!=0){
		System.out.println("Cube of "+i+": "+i*i*i+" and Square of "+ i +": "+i*i);
		}
	}
}
}