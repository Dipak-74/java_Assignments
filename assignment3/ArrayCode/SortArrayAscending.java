import java.util.Scanner;
class SortArrayAscending{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.print("array: ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
						int perious=arr[j];
						arr[j]=arr[i];
						arr[i]=perious;
						}
				}
			}
	System.out.print("Output: ");
	for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
			}		
}	
}