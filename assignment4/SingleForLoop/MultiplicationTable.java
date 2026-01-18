import java.util.*;
class MultiplicationTable{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input: N =  ");
	int n=sc.nextInt();
	System.out.println("Output: ");
	
	for(int i=1;i<=10;i++){
		
		
		System.out.println(n+" * "+i+" = "+(n*i));
			}
	}
}