package BasicPr;
//java program to find the sum of natural numbers
import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        long num= sc.nextLong();
        for(int i=1;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
