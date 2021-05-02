import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int l=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    
	    
	    while(n!=0){
	       l++;
	       n/=10;
	    }
	   System.out.println("Number of digits : "+l);
	 
	}

	
	
}
