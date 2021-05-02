import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    int temp,sum=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    temp=n;
	   
	   while(temp!=0){
	       sum+=temp%10;
	       temp/=10;
	       
	   }
	   if(n%sum==0){
	       System.out.println("Harshad Number :)");
	   }
	   else{
	       System.out.println("Not a Harshad Number :(");
	   }
	 
	}

	
	
}
