import java.util.Scanner;
public class oddeven {
    public static void  main(String[] args )
    {
        Scanner scanner =new Scanner(System.in);
        int size=scanner.nextInt();
        int[] number = new int[size];

        System.out.println(" elements:");

        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }
        int odd=0;
        int even=0;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]%2==0)
                even++;
            else 
                odd++;
        }
        System.out.print("even is "+even);
        System.out.print("\nodd is "+odd);
        scanner.close();
    }
}
