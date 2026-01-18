import java.util.*;
class SumFirstNnumbers{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	int sum=0;
	for(int i=1;i<=n;i++){
		sum+=i;
		}
	System.out.println(sum);
	}
}