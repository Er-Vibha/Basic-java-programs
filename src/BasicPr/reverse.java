package BasicPr;
//java program to print the reverse of a number
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rev=0;
        int n=s.nextInt();
        while (n!=0){
            int i=n%10;
            rev=rev*10+i;
            n=n/10;
        }
        System.out.println(rev);
    }
}
