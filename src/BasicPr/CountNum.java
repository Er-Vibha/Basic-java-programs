package BasicPr;
//java program to count number of digits in an integer
public class CountNum {
    public static void main(String[] args) {
        int count=1, num=003456677;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
