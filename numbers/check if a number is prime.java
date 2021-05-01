import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int a=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    
	    for(int i=2;i<=n/2;i++){
	        if(n%i==0){
	            a=1;
	        }
	    }
	    if(a==0){
	         System.out.println("Prime Number :)");
	    }
	    else{
	         System.out.println("Not a Prime Number:(");
	    }
	   
	 
	}
	
	
}
