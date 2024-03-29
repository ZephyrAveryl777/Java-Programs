import static java.lang.StrictMath.pow;

import java.util.Scanner;

public class Graycode 

{

    public static void main(String[] args) 

    {

        int n, result = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Binary number:");

        n = s.nextInt();

        result = GrayCode(n, 0);

        System.out.println("Gray Code:"+result);

    } 

   static int GrayCode(int x,int i)

   {

       int a, b, result = 0;

       if(x != 0)

        {

            a = x % 10;

            x = x / 10;

            b = x % 10;

            if((a & ~ b) == 1 || (~ a & b) == 1)

            {
                result = (int) (result + pow(10,i));

            }

            return GrayCode(x, ++i) + result;

        }

       return 0;

   }

}

/*
Output:
Enter Binary number:1001
Gray Code:1101
*/
