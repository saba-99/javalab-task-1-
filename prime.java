import java.util.Scanner;
public class prime{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
       
         int prime=0;
         for(int i=1;i<=number;i++)
         {
            if(number%i==0)
                prime++;
         }
         if(prime==2)
         System.out.println("prime ");
        else 
            System.out.println(" not prime ");
         scanner.close();
    }
}

