/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){

        String numberInput;
        int number;
        int guesses = 0;
        String rangeInputMin;
        int rangeMin;
        String rangeInputMax;
        int rangeMax;

        Scanner sc = new Scanner(System.in);

        System.out.println("This is a random number guessing game! Please enter the lower limit of the range you would like to guess from:");

        rangeInputMin = sc.nextLine();
        rangeMin = Integer.parseInt(rangeInputMin);

        System.out.println("Please enter the upper limit of the range you would like to guess from:");

        rangeInputMax = sc.nextLine();
        rangeMax = Integer.parseInt(rangeInputMax);

        int correctNumber = (int) (rangeMin + (Math.random() * rangeMax));

        System.out.println("Great! Please guess a number between "+rangeMin+" and "+rangeMax+"!");

        numberInput = sc.nextLine();
        number = Integer.parseInt(numberInput);

        for (int i = 1; i <= (rangeMax - rangeMin); i++) {
            if (number == correctNumber) {
                System.out.println("Amazing! You guessed the right number!");
                break;

            } else if( number > correctNumber) {
                guesses = guesses + 1;
                System.out.println("WRONG! Your guess was too high! You have guessed "+i+" times.");
                numberInput = sc.nextLine();
                number = Integer.parseInt(numberInput);

            } else {
                guesses = guesses + 1;
                System.out.println("WRONG! Your guess was too low! You have guessed "+i+" times.");
                numberInput = sc.nextLine();
                number = Integer.parseInt(numberInput);
            }
        }
    }
}
