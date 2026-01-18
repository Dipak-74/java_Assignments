import java.util.*;
class InvertedCenteredPyramid{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	for(int i=n;i>=1;i--){
		for(int s=i;s<n;s++){
				System.out.print(" ");
				}
		
		for(int j=1;j<=i;j++){
			System.out.print("* ");
				}
		System.out.println();
		}
	}
}