//import java.util.Scanner;

public class Number_Stairs {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int user_input = input.nextInt();
        //runs unlit i equals 10
        for (int i=0; i <=10 ; i++){
            // runs until i is greater than j
            for (int j = 1; j <= i; j++){
                // prints out j for each time the loop is run
                System.out.print(j);
            }
            // adds spaceing so the numbers don't get put on the same line
            System.out.println(" ");
        };

    }
}
