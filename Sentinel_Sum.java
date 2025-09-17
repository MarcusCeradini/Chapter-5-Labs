import java.util.Scanner;

public class Sentinel_Sum {
    public static void main(String[] args) {
        // gets user initial input number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int user_input = input.nextInt();
        int total_amount = 0 + user_input;

        // runs until 0 is inputted
        while (user_input != 0){
            // each time code runs it adds the new number to the total amount
            System.out.print("Enter another number: ");
            user_input = input.nextInt();
            total_amount += user_input;
        };
        // prints out the total amount from each occurance of the loop
        System.out.println(total_amount);
    }
}
