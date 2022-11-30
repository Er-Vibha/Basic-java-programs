package BasicPr;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        if(a==true && b==false)
        System.out.println("OK");
        else
            System.out.println("NOT OK");
    }
}
