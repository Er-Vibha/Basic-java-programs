package BasicPr;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int leap=s.nextInt();
        for(int i=1900;i<2022;i++)
        {
            if(i%4==0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        System.out.println(i + " " + "is a leap year");
                    }
                    else
                        System.out.println(i + " "+ "is not a leap year");
                }
                else
                    System.out.println(i + " " + "is a leap year");
            }
            else {
                System.out.println(i + " "+ "is not a leap year");
            }
        }
    }
}
