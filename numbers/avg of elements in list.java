import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    int avg=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number of elements : ");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter the elements : ");
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        avg+=a[i];
	    }
	    avg/=n;
	    System.out.println("Average = "+avg);
	  
	    
		
	}
	
	
	
}
