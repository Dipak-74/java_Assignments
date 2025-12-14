import java.util.Scanner;
class MinTwoNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int m=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int n=sc.nextInt();
		
		
					  if(m<n){
					       System.out.print(m);
						 }
					  else if(m>n){ System.out.print(n);}
						else{System.out.print("Two number are equal");}
				
		
		
	}
}