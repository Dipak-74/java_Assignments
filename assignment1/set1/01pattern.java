import java.util.Scanner;
class Pattern01{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=sc.nextInt();
   	
	
	for(int i=1;i<=n;i++){
	for(int j=1;j<=n;j++){
	if(i%2==0){
	System.out.print("1 ");
}
	else{System.out.print("0 ");
}
}
	System.out.println();	
}
 	
}
}