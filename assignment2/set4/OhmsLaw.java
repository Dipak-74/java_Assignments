import java.util.Scanner;
class OhmsLaw{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Current(amp): ");
		int m=sc.nextInt();
		System.out.print("Enter a Resistance: ");
		int n=sc.nextInt();
		if(m!=0){
			int volatage=m*n;
			System.out.print("Volatage = "+volatage);
		}
				
	}
}