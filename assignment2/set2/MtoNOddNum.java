import java.util.Scanner;
class MtoNOddNum{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.print(" Min = ");
	int m=sc.nextInt();
	System.out.print(" Max = ");
	int n=sc.nextInt();
	for(int i=m;i<n;i++){
			if(i%2!=0){
				System.out.print( i+" ");
				}
			    }
		   
}
}