import java.util.Scanner;

public class Pass_AllSubs
{

        public static void main(String[] args)
        {
            //inbuilt scanner to get user input........
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the Student Name: ");
            String name = scanner.nextLine();

            System.out.println("Please enter the Student's Roll No.: ");
            int Roll = scanner.nextInt();

            System.out.println("Please enter the Marks for Science: ");
            int science = scanner.nextInt();

            System.out.println("Please enter the Marks for Maths: ");
            int Maths = scanner.nextInt();

            System.out.println("Please enter the Marks for English: ");
            int English = scanner.nextInt();

            int total = (science + Maths + English);//Arithmetic operator to add for total...
            System.out.println("Total Marks: " + total);

            float percentage = (total/3);//Arithmetic operator for percentage....
            System.out.println("Percentage: "+ percentage);


            if (Maths < 35)//Condition to check if it matches the pass or fail number......
            {
                System.out.println("You have failed your Exam");

            } else if (English < 35)

            {
                System.out.println("You have failed your Exam");

            } else if (science < 35)
            {
                System.out.println("You have failed your Exam");

            }
            else
            {
                if (percentage >= 80) { //Check if percentage matches different ranges of grades......
                    System.out.println("Congratulations! You have passed with Grade A+");

                } else if (percentage >= 60) {
                    System.out.println("Congratulations! You have passed with Grade A");
                } else if (percentage >= 50) {
                    System.out.println("Congratulations! You have passed with Grade B");
                } else if (percentage >= 35) {
                    System.out.println("Congratulations! You have passed with Grade C");
                } else {
                    System.out.println("You have failed your exam");
                }
            }





        }





}
