import java.util.Scanner;
public class trtriangle {
    public static void main(String[] args)
    {Scanner scanner = new Scanner(System.in);
     System.out.println("Enter arm");
    double arm =scanner.nextDouble();
    double result=(Math.pow(3,0.5) / 4) * Math.pow(arm,2);
    System.out.println("result is"+result);
    scanner.close();
    }

    
}
