import java.util.Scanner;
class LinearSearchArray{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.print("array: ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
	System.out.print("Search:  ");
	int search=sc.nextInt();
	boolean isFound=false;
	for(int i=1;i<n;i++){
		if(arr[i]==search){
			isFound=true;	
			}	
			}
	if(isFound){
		System.out.println("Output: Found");
		}
	else {
		System.out.println("Output: Not Found");
		}
}	
}