package BasicPr;
import java.util.Scanner;
//java program to find the vowels and consonants
public class VowOrCons {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=a.next().charAt(0);
        if(ch=='i'||ch=='a'||ch=='e'||ch=='o'||ch=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}
