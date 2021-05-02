import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    int l=0,temp,sum=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    temp=n;
	    
	    while(temp!=0){
	       l++;
	       temp/=10;
	    }
	    temp=n;
	   while(temp!=0){
	       sum+=Math.pow(temp%10,l);
	       temp/=10;
	       l--;
	   }
	   if(n==sum){
	       System.out.println("Disarium Number :)");
	   }
	   else{
	       System.out.println("Not a Disarium Number :(");
	   }
	 
	}

	
	
}
