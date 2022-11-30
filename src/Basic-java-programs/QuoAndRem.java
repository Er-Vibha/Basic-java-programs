package BasicPr;

import java.util.Scanner;

public class QuoAndRem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float dividend= s.nextFloat();
        float divisor= s.nextFloat();
        float quotient= dividend/divisor;
        float remainder = dividend%divisor;
        System.out.println("quotient: "+ quotient );
        System.out.println("remainder:"+ remainder);
    }
}
