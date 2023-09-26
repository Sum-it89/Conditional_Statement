import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        //scanner method to request user input.........
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any five numbers: ");

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float num4 = scanner.nextFloat();
        float num5 = scanner.nextFloat();

        float average = (num1+num2+num3+num4+num5)/5;//average mathematical calculation....
        System.out.println("Average of five numbers: " + average);
    }




}