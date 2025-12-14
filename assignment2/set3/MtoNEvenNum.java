import java.util.Scanner;
class MtoNEvenNum{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Min Number:");
	int m=sc.nextInt();
	System.out.println("Enter Max Number:");
	int n=sc.nextInt();
	sc.nextLine();
	System.out.println("choice Operation:Even,Odd");
	String S=sc.nextLine();
	for(int i=m;i<n;i++){
			if(S.equalsIgnoreCase("Odd")){
				if(i%2!=0){
					System.out.print(i+" ");
					}
			     	 }
			else if(S.equalsIgnoreCase("Even")){
					if(i%2==0){
						System.out.print(i+" ");
						}
					}
			   }
}
}