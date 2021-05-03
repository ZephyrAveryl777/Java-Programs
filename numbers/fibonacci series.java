import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int a=0,b=1,temp=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n=sc.nextInt();
		 System.out.println("Fibanocci Series : ");
		if(n>=1){
		    System.out.print(a+" ");
		    
		    
		}
		if(n>=2){
		    System.out.print(b+" ");
		   
		}
		for(int i=3;i<=n;i++){
		   
		    temp=a+b;
		    a=b;
		    b=temp;
		    System.out.print(b+" ");
		    
		}
		
	}
}
