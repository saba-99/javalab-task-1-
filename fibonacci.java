import java.util.Scanner;
public class fibonacci {
    public static void  main(String[] args)
    {
         Scanner scanner =new Scanner(System.in);
         int a=0;
         int b=1;
         System.out.print(a + " "+ b + " ");
            for (int i = 3; i <= 12; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
        scanner.close();

    }
}
