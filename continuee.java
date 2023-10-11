import java.util.*;

public class continuee {
    public static void main(String args[])
    {
        //Continuee statment
        for(int i = 0;i<10;i++)
        {
            if(i == 8){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");
    }
}
