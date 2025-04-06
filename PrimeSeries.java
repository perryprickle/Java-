import java.util.Scanner;

class PrimeSeries
 {
    public static void main(String[] args) 
  {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number up to which you want to print prime numbers: ");
        int n = sc1.nextInt();
        
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++)
       {
            if (isPrime(i)) 
            {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num)
 {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
         {
            if (num % i == 0) 
           {
                return false;
            }
        }
        return true;
    }
}