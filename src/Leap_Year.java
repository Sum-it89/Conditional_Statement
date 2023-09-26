import java.util.Scanner;
public class Leap_Year
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int a = scanner.nextInt();

        if (a%4==0)
            {
                System.out.println(a + " is a Leap Year");
            }
        else
            {
                System.out.println(a + " is not a Leap Year");
            }


    }


}
