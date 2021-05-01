import java.util.Scanner;

public class Decimal2BinaryOctalandHexadecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
			System.out.println("Enter a decimal number");
		    double d = sc.nextDouble();
		
	        System.out.println(Integer.toBinaryString((int) d));  
     
	        // TODO Auto-generated method stub

	}

}

/*
Output
Enter a decimal number
21
10101
*/
