package BasicPr;
import java.util.Scanner;
//java program to find the factorial of a number
public class Fact {
    public static void main(String[] args) {
        long factorial=1;
        System.out.println("Factorial number");
        Scanner s=new Scanner(System.in);
        long f= s.nextLong();
        for(long i=f;i>1;i--)
        {
            factorial*=i;
        }
        System.out.println("factorial of " + f + " is "+ factorial);
    }
}
