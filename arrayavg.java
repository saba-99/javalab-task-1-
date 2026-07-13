import java.util.Scanner;
public class arrayavg {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] number=new int[size];
        for(int i=0;i<number.length;i++)
        {
            number[i]=scanner.nextInt();
        }
         int avg=0;
         for(int i=0;i<number.length;i++)
         {
            avg+=number[i];
         }
         int aavg=avg/number.length;
         System.out.print("avg is "+aavg);
         scanner.close();
    }
}
