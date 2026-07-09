import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a ");
        int a = scan.nextInt();
        System.out.print("Enter b ");
        int b = scan.nextInt();
         System.out.print("Enter operator ");
        char ch = scan.next().charAt(0);
         if (ch == '+') {
            int result = a + b;
            System.out.println(a +"+"+ b+ "=" + result);
        } else if (ch == '-') {
            int result = a - b;
            System.out.println(a +"-" +b +"=" + result);
        } else if (ch == '*') {
            int result = a * b;
            System.out.println(a +"*" +b+ "=" + result);
        } else if (ch == '/') {
            double result = (double) a / b;
            System.out.println(a+ "/" +b +"=" + result);
            }
          scan.close();
        }
    }
