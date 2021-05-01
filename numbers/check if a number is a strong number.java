import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    int a;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    
	    a=strong(n);
	    if(a==n){
	         System.out.println("Strong Number :)");
	    }
	    else{
	         System.out.println("Not a Strong Number:(");
	    }
	   
	 
	}
	static int strong(int n){
	    int sum=0;
	    
	    while(n!=0){
	       sum+=fact(n%10) ;
	       n=n/10;
	       
	    }
	    return sum;
	}
	
	static int fact(int n){
	    if(n==0){
	        return 1;
	    }
	    else{
	        return n*fact(n-1);
	    }
	}
	
	
	
}
