import java.util.Scanner;

public class City_Name
{
    public static void main(String[] args)
    {
        //inbuilt scanner function to get user input....
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an alphabet from a to f: ");
        char city = scanner.next().charAt(0);


        switch (city) // to check if the user input matches the condition...
        {
            case 'a':
                System.out.println("Aldershot");
                break;

            case 'b':
                System.out.println("Birmingham");
                break;

            case 'c':
                System.out.println("Coventry");
                break;

            case 'd':
                System.out.println("Durham");
                break;

            case 'e':
                System.out.println("Edinburgh");
                break;

            case 'f':
                System.out.println("Falmouth");
                break;

        }

    }

}
