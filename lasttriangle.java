import java.util.Scanner;
public class lasttriangle {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double s = (a+b+c) / 2;
        double area = Math.sqrt(s*(s - a)*(s - b)*(s - c));

        System.out.println("Area:" +area);

        scanner.close();
}
}
