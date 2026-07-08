import java.util.Scanner;
public class circle {
    public static void main(String[] args)
   {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter radius");
    float radius =scanner.nextFloat();
    double area= Math.PI * Math.pow(radius,2);
    System.out.println("volume of the ball:"+area);
    scanner.close();

   }
}

