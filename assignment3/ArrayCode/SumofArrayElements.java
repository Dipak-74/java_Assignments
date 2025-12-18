import java.util.Scanner;
class SumofArrayElements{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.print("array: ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
	int sum=0;	
	for(int i=0;i<n;i++){
		sum=sum+arr[i];
			}
	System.out.println("Output: "+sum);	
}	
}