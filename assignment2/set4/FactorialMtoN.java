import java.util.Scanner;
class FactorialMtoN{
	public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter fisrt Number: ");
	int m= sc.nextInt();
	System.out.print("Enter Last Number: ");
	int n= sc.nextInt();
	int fact=1;
	int i=m;
	while(i<=n){
		fact=fact*i;
		System.out.println(i+"! = "+fact);
		
		i++;
	}

  }
}