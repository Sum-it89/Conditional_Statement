import java.util.Scanner;
public class interchange_value
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first value: ");
        int first = scanner.nextInt();
        System.out.println("Please enter the second value: ");
        int second = scanner.nextInt();

        int temp = second;
        System.out.println("Interchanged value of first: " + temp);
        second = first;
        System.out.println("Interchanged value of Second: " + second);

    }
}
