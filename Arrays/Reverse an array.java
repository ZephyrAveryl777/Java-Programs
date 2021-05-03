import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	   
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements :");
      n = sc.nextInt();
      System.out.println("Enter the elements : ");
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
     
     System.out.println("Reversed array :");
     for(int i=n-1;i>=0;i--){
        System.out.print(a[i]+" "); 
     }
      
     
	}
   
}
