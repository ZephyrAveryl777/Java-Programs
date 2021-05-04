import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     int n,rot,temp=0;
     System.out.print("Enter the number of elements :");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     
     int[] a=new int[n];
     System.out.println("Enter the elements :");
     for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
     }
     System.out.println("Enter the number of times to be rotated :");
     rot=sc.nextInt();
     for(int i=0;i<rot;i++){
         temp=a[0];
         for(int j=0;j<n-1;j++){
             a[j]=a[j+1];
         }
         a[n-1]=temp;
     }
     
     System.out.println("Left rotated array : ");
     for(int i=0;i<n;i++){
         System.out.print(a[i]+" ");
     }
    }
}
