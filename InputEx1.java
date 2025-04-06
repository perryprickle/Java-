import java.util.*;

public class SeriesPrinter 
{
    public static void main(String[] args)
 {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc1.nextInt();
        
        System.out.println("Series up to " + n + " terms:");
        for (int i = 0; i <= n; i++) 
       {
            System.out.print(i + " ");
        }
    }
}