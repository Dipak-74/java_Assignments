import java.util.Scanner;
class Velocity{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Distance(m): ");
		int m=sc.nextInt();
		System.out.print("Enter a Time(sec): ");
		float n=sc.nextInt();
		if(m!=0){
			double Velocity=m/n;
			System.out.print((double)Velocity+" m/s");
		}
				
	}
}