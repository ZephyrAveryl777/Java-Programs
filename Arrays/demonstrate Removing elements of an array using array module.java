import java.util.Scanner;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	   int x,pos,loop=1;
      ArrayList<Integer> a=new ArrayList<Integer>();
      System.out.print("Enter number of elements: ");
      Scanner sc= new Scanner(System.in);
      int n =sc.nextInt();
      System.out.println("Enter the elements: ");
      for(int i=0;i<n;i++){
          x=sc.nextInt();
          a.add(x);
      }
      
      
      System.out.print("Enter the position to remove the element : ");
     pos=sc.nextInt();
     while(loop==1){
        
           a.remove(pos-1);
         System.out.println("To continue press 1 else press any number !");
         loop=sc.nextInt();
         if(loop==1){
           System.out.print("Enter the position to remove the element : ");  
           pos=sc.nextInt();
         }
         
     }
     
      System.out.print("Final array : "); 
      for(int i=0;i<a.size();i++){
           System.out.print(a.get(i)+" ");
      }
     
	}
   
}
