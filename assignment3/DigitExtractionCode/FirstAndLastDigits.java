import java.util.Scanner;
class FirstAndLastDigits{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int rem=n%10;
	int last=rem;
	int rem2=0;
	while(n>0){
		 rem2=n%10;
		n=n/10;
		}
	System.out.println("Output:  "+"First= "+rem2+", Last="+last);	
}	
}



