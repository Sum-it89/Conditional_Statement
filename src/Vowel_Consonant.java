import java.util.Scanner;

public class Vowel_Consonant
{
    public static void main(String[] args)
    {
        //Scanner inbuilt function to get user input.......
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any Alphabet: ");
        char alphabet = scanner.next().charAt(0);

        //Condition to place check if the user input matches vowel characters....
        if (alphabet == 'a'|| alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
        {
            System.out.println(alphabet + " is a Vowel");
        }
        else //every other alphabets will be ignored as consonant......
        {
            System.out.println(alphabet + " is a Consonant");
        }
    }
}
