import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	   
      int n,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      n = sc.nextInt();
      System.out.println("Smallest divisor : ");
      for(int i=2;i<n/2;i++){
          if(n%i==0){
              System.out.println(i);
              temp=1;
              break;
          }
      }
      if(temp==0){
          System.out.println("Divisors are 1 and "+n);
      }
     
	}
   
}
