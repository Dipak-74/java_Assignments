import java.util.Scanner;
class SmallestElementArray{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.print("array: ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		
	int min=arr[0];
	for(int i=0;i<n;i++){
		if(min>arr[i]){
				min=arr[i];
				}
			}
	System.out.println("Output: "+min);	
}	
}