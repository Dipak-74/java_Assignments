import java.util.Scanner;
class MiddleDigitNum{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int reverse=0;
	int count=0;
	while(n>9){
		 int rem=n%10;
		if(count>0){
			reverse=reverse*10+rem;
			}
		n=n/10;
		count++;
		}
	
	int Mid=0;
	while(reverse>0){
		int rem=reverse%10;
		Mid=Mid*10+rem;
		reverse=reverse/10;
		}
	System.out.println("Output: "+Mid);	
}	
}



