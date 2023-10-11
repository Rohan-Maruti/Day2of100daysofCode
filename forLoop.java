import java.util.*;
public class forLoop {
    public static void main(String args[]){
        //1.print the patern using for loop
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        // for(int i = 0;i<4;i++)
        // {
            // for(int j = 0;j<4;j++)
            // {
                // System.out.print(" * ");
            // }
            // System.out.println();
        // }

        // 2. Print reverse of number
        // ex : 1029 => 9201 
        // here thr to get last digit we can use (%10) and to remove lsat digit (/10)
        int n = 1029;
        int revnum = 0;
        for(int i =0;n>0;i++){
            int lastdigt = n%10;
            revnum = (revnum*10)+lastdigt;
            n = n/10;
        }
        System.out.print(revnum);
    }
}
