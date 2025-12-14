import java.util.Scanner;
class CubeSquareEvenNum{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Rang number:");
	int n=sc.nextInt();
	System.out.println("Choice Operation:Even,Odd");
	String S=sc.next();
	for(int i=1;i<=n;i++){
			if(S.equalsIgnoreCase("Even")){
					if(i%2==0){
						System.out.println("Cube of "+i+": "+i*i*i+" and Square of "+ i +": "+i*i);
							}
							}
			else if(S.equalsIgnoreCase("Odd")){
			if(i%2!=0){
						System.out.println("Cube of "+i+": "+i*i*i+" and Square of "+ i +": "+i*i);

							}
			
		}
	}
}
}