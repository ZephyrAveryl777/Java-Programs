import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	   
      int n,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      n = sc.nextInt();
      System.out.println("Sum : ");
      for(int i=1;i<=n;i++){
          temp+=i;
      }
     
     System.out.println(temp);
      
     
	}
   
}
