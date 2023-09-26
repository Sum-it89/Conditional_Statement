import java.util.Scanner;

public class Eligible
{
    public static void main(String[] args)
    {
        //scanner method to request user input in int....
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18 )//condition to check the eligibility of age.....

        {
            System.out.println("The given age " + age + " is Eligible");//if the user inputs 18 or above number....
        }
        else
        {
            System.out.println("The given age " + age + " is Not Eligible");//if the user inputs less than 18 number...
        }

    }
}
