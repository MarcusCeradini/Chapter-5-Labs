import java.time.LocalTime;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user_input;

        //Gets current time
        LocalTime currenttime = LocalTime.now();

        //runs until 3 is entered
        do {
            System.out.println("Enter 1 to say hello");
            System.out.println("Enter 2 to current time");
            System.out.println("Enter 3 to exit");
            System.out.print("Enter a number: ");
            user_input = input.nextInt();

            // if 1 is entered prints hello
            if (user_input == 1){
                System.out.println("Hello");
            }
            //if 2 is printed it imports the current time
            else if (user_input == 2) {
                System.out.println(currenttime);
            }
            //if 3 is imported it gets out of the statement so the else statement does not run
            else if(user_input == 3){
                break;
            }
            //if nothing works is reprompts user
            else {
                System.out.print("Enter a number: ");
                user_input = input.nextInt();
            }


        } while (user_input != 3);

    }
}