import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args)
   {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number ");
    int number=scanner.nextInt();
    if(number>=0 && number<=39)
        System.out.println(" F");
    if(number>=40 && number<=59)
        System.out.println(" C+");
    if(number>=60&& number<=69)
        System.out.println(" B");
    if(number>=70 && number<=79)
        System.out.println(" A-");
    if(number>=80 && number<=89)
        System.out.println(" A");
    if(number>=90 )
        System.out.println(" A+");
    scanner.close();
   }
}
