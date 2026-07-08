import java.util.Scanner;
public class celciustofarenheit {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter farenheit");
    double farenheit =scanner.nextDouble();
    double celcius= ((farenheit- 32) / 9)*5;
    System.out.println("celcius is"+celcius);
    scanner.close();
    }
}
