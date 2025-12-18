import java.util.Scanner;
class CheckDuckNum{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	boolean isFound=false;
	while(n>0){
		int rem=n%10;
		if(rem==0){
			isFound=true;
			break;
			}
		n=n/10;
		}
	if(isFound){
		System.out.println("Output: Duck Number");
		}
	else{
	   System.out.println("Output: Not Duck Number");
		}	
}	
}