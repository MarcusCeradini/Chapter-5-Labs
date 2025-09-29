import java.util.Scanner;

public class Spaced_Stairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // gets character input
        System.out.print("Enter a character: ");
        String user_input = input.next().substring(0,1);
        // gets number of levels input
        System.out.print("Enter number of levels: ");
        int user_number = input.nextInt();
        int char_amount = user_number;

        // each time loop runs it adds 1 to i and during loop adds 1 to user number
        for (int i = 1; i < user_number+1; i++){
            // the amount of spaces that get printed out gets subtracted by 1 each time loop is run
            char_amount -= 1;
            //prints spaces repeating with char_amount then adding the character from user_input
            // with the remaining space
            System.out.println(" ".repeat(char_amount) + user_input.repeat(i));
        }

    }
}
