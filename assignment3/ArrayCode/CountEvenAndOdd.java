import java.util.Scanner;
class CountEvenAndOdd{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.print("array: ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
	int Evencount=0;
	int Oddcount=0;	
	for(int i=0;i<n;i++){
			if(i%2==0){
				Evencount++;
				}
			else if(i%2!=0){
				Oddcount++;	
				}			
			}
	System.out.print("Output: "+"Even= "+Evencount+" Odd= "+Oddcount);	
}	
}