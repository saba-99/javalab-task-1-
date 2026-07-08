import java.util.Scanner;
public class trianglearea
{
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter base");
    double base=scanner.nextDouble();
    System.out.println("Enter height");
    double height=scanner.nextDouble();
    double area=0.5*base*height;
    System.out.println("area of the triangle:"+area);
    scanner.close();
    }
}