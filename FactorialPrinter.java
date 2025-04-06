import java.util.*;

class FactorialPrinter
 {
    public static void main(String[] args) 
   {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc1.nextInt();
        
        System.out.println("Factorials up to " + n + ":");
        for (int i = 1; i <= n; i++) 
        {
            System.out.println("Factorial of " + i + " is " + factorial(i));
        }
     }

    public static int factorial(int num) 
     {
        if (num == 0)
        {
            return 1;
        }
        return num * factorial(num - 1);
    }
}