import java.util.*;

public class primeOrNot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n =  sc.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<n-1;i++){
            if(n%i == 0)
            {
                isPrime = false;
            }
        }
        if(isPrime == true)
        {
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
     }
}
