import java.util.Scanner;
public class volumeofball {
    public static void main(String[] args)
   {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter radius");
    float radius =scanner.nextFloat();
    double volume=(4.0/3) * Math.PI * Math.pow(radius,3);
    System.out.println("volume of the ball:"+volume);
    scanner.close();

   }
}
