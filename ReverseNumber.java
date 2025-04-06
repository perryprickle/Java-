import java.util.*;

class ReverseNumber
 {
    public static void main(String[] args) 
   {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc1.nextInt();
        
        int reversedNumber = reverse(n);
        System.out.println("The reverse of " + n + " is " + reversedNumber);
    }

    public static int reverse(int num)
 {
        int reversed = 0;
        while (num != 0) 
       {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}