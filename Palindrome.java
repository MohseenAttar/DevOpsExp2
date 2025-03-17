// Program to check given number is palindrome or not

import java.util.*;

class GFG {
    static int reverseNumber(int n) {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int reverseN = reverseNumber(n);
        System.out.println("Reverse of "+n+" = " + reverseN);

        if (n == reverseN)
            System.out.println(n+" is palindrome number");
        else
            System.out.println(n+" is not palindrome number");
     }
}
          //-----------Thank You !!-----------
