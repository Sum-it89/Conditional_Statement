import java.util.Scanner;

public class Name_of_week
{
    public static void main(String[] args)
    {
        //Scanner inbuilt function to get user input.....
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to get days of the week: ");
        int name = scanner.nextInt();

        switch (name) //Condition to get int as input to match the days of the week...
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }

    }
}
