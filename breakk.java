import java.util.*;

public class breakk {
    public static void main(String args[])
    {
        //Break statment
        for(int i = 0;i<10;i++)
        {
            if(i == 8){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");
    }
}
