import java.util.*;
class CharacterTriangle{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Size: ");
	int n=sc.nextInt();
	char [] arr=new char[n];
	System.out.print("Enter Characters: ");
	for(int i=0;i<=n-1;i++){
			arr[i]=sc.next().charAt(0);
			}
	for(int i=0;i<=n-1;i++){
		for(int j=0;j<=i;j++){
			
		System.out.print(arr[j]+" ");
			
				}
		System.out.println();
		}
	}
}

class CharacterCharTriangle{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Size: ");
	char ch=sc.next().charAt(0);
		for(char i='A';i<=ch;i++){
		for(char j='A';j<=i;j++){
			
		System.out.print(j+" ");
			
				}
		System.out.println();
		}
	}
}