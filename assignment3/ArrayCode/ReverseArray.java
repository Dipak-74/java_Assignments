import java.util.Scanner;
class ReverseNumArray{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.print("array: ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
	for(int i=n-1;0<=i;i--){
			System.out.print(arr[i]+" ");			
			}
	
}	
}