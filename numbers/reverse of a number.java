import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	   
      int n,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      n = sc.nextInt();
      
      while(n!=0){
          temp=temp*10+n%10;
          n=n/10;
      }
      System.out.println("Reversed Number : "+temp);

     
	}
   
}
