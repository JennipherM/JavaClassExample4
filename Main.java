/*
create rock, paper, scissors

*/
import java.util.Random;
import java.util.Scanner; 

enum Choice
        {
            rock,
            paper,
            scissors
        }

public class Main {
    public static void main(String[] args) {

        while (true)
      {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter rock, paper, or scissors(or exit to quit)");
        Random random = new Random();

        String userInput = input.nextLine().toLowerCase();
        if (userInput == "EXIT") break; // stop the game
        
        Choice userChoice = Choice.valueOf(userInput);
        Choice compChoice = Choice.values()[random.nextInt(2)];

        if (userChoice == compChoice )
        {
            System.out.println("Its a tie");
        }
        else if (userChoice == Choice.rock && compChoice == Choice.paper ||
                 userChoice == Choice.paper && compChoice == Choice.scissors || 
                 userChoice == Choice.scissors && compChoice == Choice.rock)
        {
            System.out.println("you lose");
        }
        else 
        {
            System.out.println("you win");
        }
    }
}
}