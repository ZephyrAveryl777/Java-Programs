import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int a=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	     System.out.println("Prime Factors : ");
	    for(int i=2;i<n;i++){
	        if(n%i==0){
	            if(prime(i)){
	                System.out.println(i);
	            }
	        }
	    }
	   
	 
	}
	static boolean prime(int n){
	    for(int i=2;i<n/2;i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
	
	
}
