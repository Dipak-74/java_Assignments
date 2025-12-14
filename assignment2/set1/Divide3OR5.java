import java.util.Scanner;
class Div3Or5{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number:");
	int m=sc.nextInt();
	System.out.println("Enter Second number:");
	int n=sc.nextInt();
	for(int i=1;i<=100;i++){
	if(i%m==0 || i%n==0){
			System.out.print(i+" ");
			}
	}
}
}