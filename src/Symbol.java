import java.util.Scanner;

public class Symbol
{
    public static void main(String[] args)
    {
        //scanner method to request user input in float....
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        float num1 = scanner.nextFloat();
        System.out.println("Please enter second number: ");
        float num2 = scanner.nextFloat();

        //scanner method to request user input for their symbol....
        System.out.println("Please enter your symbol: ");
        char symbol = scanner.next().charAt(0);

        switch (symbol) //switch function for condition.....
            {
                case '+':
                    System.out.println("Addition: " + (num1+num2));
                    break;

                case '-':
                    System.out.println("Subtraction: " + (num1-num2));
                    break;

                case '/':
                    System.out.println("Divide: " +(num1/num2));
                    break;

                case '*':
                    System.out.println("Multiply: " + (num1*num2));
                    break;

            }
    }
}
