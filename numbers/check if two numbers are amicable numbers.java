import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int sa=0,sb=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the first number : ");
	    int a=sc.nextInt();
	    
	    System.out.println("Enter the second number : ");
	    int b=sc.nextInt();
	    
	    for(int i=1;i<a;i++){
	        if(a%i==0){
	            sa+=i;
	        }
	    }
	     for(int i=1;i<b;i++){
	        if(b%i==0){
	            sb+=i;
	        }
	    }
	    
	    if(sa==b && sb==a){
	         System.out.println("Amicable Numbers :)");
	    }
	    else{
	         System.out.println("Non Amicable Numbers :(");
	    }
	   
	 
	}
	
	
}
