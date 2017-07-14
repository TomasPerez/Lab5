import java.util.Random;
import java.util.Scanner;

/**
 * Created by DELL on 7/13/2017.
 */
public class Lab5 {
    static Random ranNum;

    public static void main(String [] args){
        ranNum = new Random();
        Scanner scan = new Scanner(System.in);

        int userInput;
        String answer = " ";

        System.out.println("Welcome to the Grand Circus Casino! ");
        System.out.print("Please enter a number of sides for a pair of dice ");
        userInput = scan.nextInt();

        System.out.println("You can now ROLL the DICE! ");
        System.out.println(casino(userInput));
        System.out.println(casino(userInput));
;
        System.out.println("Would you like to Roll again? (y/n): ");
        scan.nextLine();
        answer = scan.next();



    }


    public static int casino(int newvariable)
    {
        int dice1 = ranNum.nextInt((newvariable) + 1);


        return dice1;
    }

}