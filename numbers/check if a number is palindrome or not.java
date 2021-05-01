import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int a;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    
	    a=pallin(n);
	    if(a==n){
	         System.out.println("Pallindrome Number :)");
	    }
	    else{
	         System.out.println("Not a Pallindrome Number:(");
	    }
	   
	 
	}
	static int pallin(int n){
	    int temp=0,sum=0;
	    
	   
	    while(n!=0){
	        temp=n%10;
	        sum=sum*10+temp;
	        n/=10;
	    }
	    return sum;
	}

	
}
