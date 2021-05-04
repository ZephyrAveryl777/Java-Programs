import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      int n,temp;
      System.out.print("Enter the number of elements: ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter the elements: ");
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(a[i]<a[j]){
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
      }
      
      System.out.print("Sorted array : ");
      for(int i=0;i<n;i++){
          System.out.print(a[i]+" ");
      }
    }
}
