package BasicPr;
//java program to print the fibonacci series
public class fibonacci {
    public static void main(String[] args) {
        int n=10, n1=0, n2=1, n3;
        for (int i=0;i<=n;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
}
