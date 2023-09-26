import java.util.Scanner;

public class Any_Value
{
    public static void main(String[] args)
    {
        //Scanner inbuilt function to get user input.......
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any value: ");
        char value = scanner.next().charAt(0);


        if (Character.isDigit(value)) //inbuilt Condition to check if user input is a digit....
        {
            System.out.println("The entered value is a Digit");
        }
        else if (Character.isAlphabetic(value))//inbuilt Condition to check if user input is an alphabet...
        {
            System.out.println("The entered value is an Alphabet");
        }
        else //everything else would be considered as symbol...
            System.out.println("The entered value is a Symbol");

    }
}
