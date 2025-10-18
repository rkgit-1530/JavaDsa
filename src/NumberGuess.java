import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int RandomNumber = rand.nextInt(100) + 1;
        System.out.println(RandomNumber);
        boolean isFound = true;
        while (isFound) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if(num==RandomNumber){
                System.out.println("Number Found");
                isFound=false;
            }
            else if (RandomNumber - 10 < num && num < RandomNumber + 10) {
                System.out.println("Hot");
            } else {
                System.out.println("Cold");
            }

        }
    }
}