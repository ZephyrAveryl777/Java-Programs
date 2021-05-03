import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	   
      int n,loop=1,pos;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements :");
      n = sc.nextInt();
      System.out.println("Enter the elements : ");
      int a[]=new int[n];
      
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      
     System.out.print("Enter the position to be accessed : ");
     pos=sc.nextInt();
     while(loop==1){
         System.out.println("Element = "+a[pos-1]);
         System.out.println("To continue press 1 else press any number !");
         loop=sc.nextInt();
         if(loop==1){
           System.out.print("Enter the position to be accessed : ");  
           pos=sc.nextInt();
         }
         
     }
      
     
	}
   
}
