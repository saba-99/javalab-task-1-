import java.util.Scanner;
public class sumloop{
    public static void main(String[] args) {
        int sum=0;
        for (int i = 2; i <= 20; i += 2) {
            sum+=i;
        }
        System.out.print(sum);
         System.out.print("\n");

        int sum2=0;
        for (int i = 1; i <= 20; i += 2) {
            sum2+=i;
        }
        System.out.print(sum2);
    }
}
     