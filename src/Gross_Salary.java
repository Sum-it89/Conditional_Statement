import java.util.Scanner;
public class Gross_Salary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the employee ID: ");
        int ID = scanner.nextInt();

        System.out.println("Please enter employee name: ");
        String employee = scanner.next();

        System.out.println("Please enter employee salary: ");
        int salary = scanner.nextInt();

        float HRA = (salary*10)/100;
        System.out.println("Employee HRA: " + HRA);

        float DA = (salary*8)/100;
        System.out.println("Employee DA: " + DA);

        float TA = (salary*9)/100;
        System.out.println("Employee TA: " + TA);

        float PF = (salary*20)/100;
        System.out.println("Employee PF: " + PF);

        float Gross = (salary+HRA+DA+TA+PF);
        System.out.println("Gross Salary: " + Gross);



    }
}
