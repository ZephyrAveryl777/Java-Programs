import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      int n,temp=0;
      System.out.print("Enter the number of elements: ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter the elements: ");
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
     
      for(int i=0;i<n;i++){
          temp+=a[i];
          
      }
      System.out.print("Sum = "+temp);
    }
}
