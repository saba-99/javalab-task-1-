import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        int i=2;
        while(i<=20)
        {
            System.out.print(i + " ");
            i+=2;
        }
        System.out.print("\n");
         int j=2;
        do{
            System.out.print(j+" ");
            j+=2;
        }while(j<=20);
    }
}
     