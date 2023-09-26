
import java.util.Scanner;
public class Odd_Even
{
    public static void main(String[] args)

    {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number in whole digit");
        int a = scanner.nextInt();

        String number = (a%2==0)? "Even" : "Odd";
        System.out.println(number);

    }




}
