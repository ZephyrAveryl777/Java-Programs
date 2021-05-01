import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    int a;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    
	    a=divsum(n);
	    if(a==n){
	         System.out.println("Perfect Number :)");
	    }
	    else{
	         System.out.println("Not a Perfect Number:(");
	    }
	   
	 
	}
	static int divsum(int n){
	    int sum=0;
	    for(int i=1;i<n;i++){
	        if(n%i==0){
	            sum+=i;
	        }
	    }
	    return sum;
	}
	
	
	
}
