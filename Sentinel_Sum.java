import java.util.Scanner;

public class Sentinel_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int user_input = input.nextInt();
        int total_amount = 0 + user_input;

        while (user_input != 0){
            System.out.print("Enter another number: ");
            user_input = input.nextInt();
            total_amount += user_input;
        };
        System.out.println(total_amount);
    }
}
