import java.util.Scanner;
class LeftPattern{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number:");
	int n=sc.nextInt();
	System.out.print("Enter a Character:");
	String m=sc.next();
   	
	
	for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
	System.out.print(m +" ");
}
	System.out.println();	
}
 	
}
}