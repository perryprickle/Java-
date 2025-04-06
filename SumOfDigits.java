import java.util.*;

class SumOfDigits
 {
    public static void main(String[] args) 
   {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc1.nextInt();
        
        int sum = sumOfDigits(n);
        System.out.println("The sum of the digits of " + n + " is " + sum);
    }

    public static int sumOfDigits(int num)
   {
        int sum = 0;
        while (num != 0)
       {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}