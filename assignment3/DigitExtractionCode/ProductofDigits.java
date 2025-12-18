import java.util.Scanner;
class ProductofDigits{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input:  ");
	int n=sc.nextInt();
	int Mul=1;
	while(n>0){
		int rem=n%10;
		Mul=Mul*rem;
		n=n/10;
		}
	System.out.println("Output:  "+Mul);	
}	
}