import java.util.Scanner;
public class greatarray {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] number=new int[size];
        for(int i=0;i<number.length;i++)
        {
            number[i]=scanner.nextInt();
        }
         int largest=0;
         for(int i=0;i<number.length;i++)
         {
            if(number[i]>largest)
                largest=number[i];
         }
         
         System.out.print("largest is "+largest);
         scanner.close();
    }
}

