import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    boolean res;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    
	    res= power(n);
	    if(res){
	        System.out.println(n+" is power of 2");
	    }
	    else{
	        System.out.println(n+" is not power of 2");
	    }
		
	}
	
	
	static boolean power(int n){
	    if(n==0){
	        return false;
	    }
	    while(n!=1){
	        if(n%2!=0){
	            return false;
	        }
	        n/=2;
	    }
	    return true;
	}
}
