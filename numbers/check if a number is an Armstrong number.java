import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    
	    int a;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    
	    a=strong(n);
	    if(a==n){
	         System.out.println("Amstrong Number :)");
	    }
	    else{
	         System.out.println("Not an Amstrong Number:(");
	    }
	   
	 
	}
	static int strong(int n){
	    int l=0,temp=n,sum=0;
	    
	    while(temp!=0){
	       l++ ;
	       temp/=10;
	       
	    }
	    while(n!=0){
	        sum+=Math.pow(n%10,l);
	        n/=10;
	    }
	    return sum;
	}

	
}
