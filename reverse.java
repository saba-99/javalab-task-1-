import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        int size = scanner.nextInt();

        int[] number = new int[size];

        System.out.println(" elements:");

        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }

        System.out.println("Reversed series:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }

        scanner.close();
    }
}