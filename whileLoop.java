import java.util.*;

public class whileLoop{
    public static void main(String args[])
    {
        //1.print the number from 1 to 10
        int i = 1;
        // while(i<=10){
            // System.out.println(i);
            // i++;
        // }

        // 2.Print a numbers from 1 to n

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of n :");
        // int n = sc.nextInt();
        // while(i<=n)
        // {
            //  System.out.println(i);
            //  i++;
        // }


        // 3. Sum of first n natural number
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter value of n :");
         int n = sc.nextInt();
         int sum = 0;
        while(i<=n)
          {
           sum += i;
           i++;
        }
        System.out.println(sum);

    }
}