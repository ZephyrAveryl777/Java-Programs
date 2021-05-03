import java.util.Scanner;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	   int x,s,loop=1;
      ArrayList<Integer> a=new ArrayList<Integer>();
      System.out.print("Enter number of elements: ");
      Scanner sc= new Scanner(System.in);
      int n =sc.nextInt();
      System.out.println("Enter the elements: ");
      for(int i=0;i<n;i++){
          x=sc.nextInt();
          a.add(x);
      }
      
      
      System.out.print("Enter the  element to be searched : ");
     s=sc.nextInt();
     while(loop==1){
        
         for(int i=0;i<a.size();i++){
             if(a.get(i)==s){
                 System.out.println("Element "+s+" found at position "+(i+1)); 
             }
             
         }
         System.out.println("To continue press 1 else press any number !");
         loop=sc.nextInt();
         if(loop==1){
           System.out.print("Enter the element to be searched : ");  
           s=sc.nextInt();
         }
         
     }
      
    
     
	}
   
}
