import java.util.Scanner;

public class Commission
{
    public static void main(String[] args)
    {
        //inbuilt scanner to get user input........
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Sales Id: ");
        int ID = scanner.nextInt();

        System.out.println("Please enter Seller's name: ");
        String name = scanner.next();

        System.out.println("Please enter Sales amount: ");
        float sales = scanner.nextFloat();

        System.out.println("Please enter Basic salary: ");
        float salary = scanner.nextFloat();

        float commission;
        if (sales >= 50000)// condition to check the range of salary entered.........
        {
            commission = (sales*35)/100;//35% commission
            System.out.println("Sales Commission: " + commission);
        }
        else if (sales >= 30000)
        {
            commission = (sales*20)/100;//20% commission
            System.out.println("Sales Commission: " + commission);
        }
        else if (sales >= 20000)
        {
            commission = (sales*10)/100;//10% commission
            System.out.println("Sales Commission: " + commission);
        }
        else if (sales >= 10000)
        {
            commission = (sales * 5) / 100;//5% commission
            System.out.println("Sales Commission: " + commission);
        }
        else
        {
            commission = (sales*2)/100;//2% commission
            System.out.println("Sales Commission: " + commission);

        }
    }


}
