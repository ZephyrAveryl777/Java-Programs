import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	   
      int n,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      n = sc.nextInt();
      System.out.println("Sum of digits : ");
      while(n!=0){
          temp+=n%10;
          n/=10;
      }
     
     System.out.println(temp);
      
     
	}
   
}
