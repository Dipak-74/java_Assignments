import java.util.Scanner;
class FrequencyofElement{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.print("array: ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
	System.out.print("Element:  ");
	int element=sc.nextInt();
	int count=0;
	for(int i=0;i<n;i++){
		if(arr[i]==element){
			count++;
				}	
			}
	System.out.println("Output: "+count);

	}	
}