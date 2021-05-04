import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     int n;
     System.out.print("Enter the number of elements :");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     
     int[] a=new int[n];
     System.out.println("Enter the elements :");
     for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
     }
     
     System.out.println("Elements at even position : ");
     for(int i=1;i<n;i+=2){
         System.out.print(a[i]+" ");
     }
    }
}
