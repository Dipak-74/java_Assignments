import java.util.Scanner;
class PerfectNum{
	public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int n= sc.nextInt();
	int sum=0;
	int i=1;
	while(i<n){
		if(n%i==0){
			sum=sum+i;
			}
		i++;
		
		}
	if(n==sum){
	System.out.println(n+" is a Perfect number.");
	}
	else{System.out.println(n+" is a not Perfect number.");
}
  }
}