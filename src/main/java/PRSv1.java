import java.util.Scanner;

public class PRSv1 {
    public static void main(String[] arg){

        System.out.println("Welcome to the Paper/Rock/Scissors Simulator Version 1");

        System.out.println("\n1. Paper");
        System.out.println("2. Rock");
        System.out.println("3. Scissors");
        System.out.println("Please choose your weapon:");
        Scanner input = new Scanner(System.in);
        int playerChoice = input.nextInt();
        int computerChoice = (int) (Math.random() * 3)+1;
// limit input to given ints only
if ((playerChoice <1) || (playerChoice>3)){
    playerChoice = (int) (Math.random() * 3)+1;
    System.out.println("You didn't enter a valid choice, so one was randomly assigned!");

}
        System.out.println("You chose: " + playerChoice + " The computer chose: " + computerChoice);

        String result = "";

        if (playerChoice == computerChoice){
            result = "it's a tie!";
        }

        if (playerChoice == 1) { //player chooses paper
            if (computerChoice == 2) {
                result = "You win! Your Paper covered the computer's Rock!";
            } else if (computerChoice == 3) {
                result = "You lose! Your Paper was cut by the computer's Scissors!";
            }
        } else if (playerChoice == 2) { //player chooses rock
            if (computerChoice == 3) {
                result = "You win! Your Rock smashed the computer's Scissors!";
            } else if (computerChoice == 1) {
                result = "You lose! Your rock was covered by the computer's Paper!";
            }
        } else if (playerChoice == 3) { //player chooses Scissors
            if (computerChoice == 1) {
                result = "You win! Your Scissors cut the computer's Paper!";
            } else if (computerChoice == 2) {
                result = "You lose! Your Scissors were smashed by the computer's Rock!";
            }
        }
        System.out.println("\n" + result);

    }
}
