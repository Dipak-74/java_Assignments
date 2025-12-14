import java.util.Scanner;
class MaxThreeNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int m=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int n=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int l=sc.nextInt();
		
		
				if(m<n){
					if(l<n){
					      System.out.print(n);
						}
					else {
					      System.out.print(l);
					      }
					}
				else if(n<m){
					if(l<m){
					      System.out.print(m);
						}
						else {
						     System.out.print(l);
							}

						}
						
						
	}
}