import java.util.Scanner;

public class Upper_Lower
{
    public static void main(String[] args)
    {
        //scanner method to request user input....
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word in UPPERCASE: ");
        String word = scanner.nextLine();

        System.out.println("Your result: " + word.toLowerCase());//inbuilt condition to convert uppercase string into lower
    }
}
