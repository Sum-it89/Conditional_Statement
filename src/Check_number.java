import java.util.Scanner;

public class Check_number
{
    public static void main(String[] args)
    {
        //scanner method to request user input....
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int number = scanner.nextInt();

        if (number > 0)//condition to see if the user number matches....
        {
            System.out.println("The number is Positive");
        }
        else if (number == 0)
        {
            System.out.println("The number is Zero");
        }
        else
        {
            System.out.println("The number is negative");
        }
    }
}
