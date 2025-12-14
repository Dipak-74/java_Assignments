import java.util.Scanner;
class Calculator{
	public static void main(String[]agrs){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter First number:");
	int m=sc.nextInt();
	System.out.print("Enter Second number:");
	int n=sc.nextInt();
	System.out.print("select oparation(+ - * /):  ");
	char op=sc.next().charAt(0);
	double result=0;
	if(op=='+'){
	result=m+n;
	}
	else if(op=='-'){
	if(m<n){
	result=n-m;
	}
	else{
   	result=m-n;
	}
	}
	else if(op=='*'){
	result=m*n;
	}
	else if(op=='/'){
	if(n!=0){
	result=m/n;
	}
	else{System.out.println("Cannot divide by Zero");}
	}
	else{
	System.out.println("Invalid oparation");
	}
	System.out.println("Result: "+result);
}
}