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
      int copy[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
     
     System.out.println("Copied array :");
     for(int i=0;i<n;i++){
        copy[i]=a[i];
     }
     for(int i=0;i<n;i++){
         System.out.print(copy[i]+" "); 
     }
      
     
	}
   
}
