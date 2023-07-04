import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain = "";
        int point = 0;
        int rollNumber = 0;
//        int die1 = 0;
//        int die2 = 0;
//        int sum = 0;
        boolean gameOver = false;
        do {
            rollNumber = 0;
            gameOver = false;
            do {
                rollNumber++;
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int crapsRoll = die1 + die2;
                System.out.println("die 1: " + die1);
                System.out.println("die 2: " + die2);
                System.out.println("Sum: " + crapsRoll);
                if(rollNumber == 1){
                    if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12 ){
                        System.out.println("Craps! You lost.");
                        gameOver = true;
                    }
                    else if(crapsRoll == 7 || crapsRoll == 11){
                        System.out.println("Natural! You win.");
                        gameOver = true;
                    }
                    else {
                        point = crapsRoll;
                        System.out.println("The point is now " + point);

                    }
                }
                else {
                    if(crapsRoll == point){
                        System.out.println("You got the point! You win.");
                        gameOver = true;
                    }
                    else if(crapsRoll == 7){
                        System.out.println("You rolled a 7! You lose.");
                        gameOver = true;
                    }
                    else {
                        System.out.println("Trying for point.");
                    }
                }

            }while(!gameOver);
            System.out.println("Enter Y to play again.");
            playAgain = in.next();

        }while(playAgain.equalsIgnoreCase("Y"));
    }
}