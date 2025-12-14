import java.util.Scanner;
class LeftPatternaA{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
			if(i%2!=0){
				System.out.print("a"+" ");
				}
			else{System.out.print("A"+" ");}
			}
System.out.println();

	}
}
}