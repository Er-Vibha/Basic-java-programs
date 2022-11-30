package BasicPr;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("First Num:");
        int x=in.nextInt();
        System.out.println("Second Num:");
        int y=in.nextInt();
        System.out.println("The sum is"+" "+ (x+y));
        System.out.println("The sub is"+" "+ (x-y));
        System.out.println("The mul is"+" "+ (x*y));
        System.out.println("The div is"+" "+ (x/y));
        System.out.println("The mod is"+" "+ (x%y));
    }
}
