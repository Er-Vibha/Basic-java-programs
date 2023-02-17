package BasicPr;
//java program to find if it is character or not
import java.util.Scanner;
class Character {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            char ch= sc.next().charAt(0);
            if(ch>='a'&& ch<='z' || ch>='A'&&ch<='Z')
                System.out.println("It is a character");
            else
                System.out.println("Not character");
        }
    }

