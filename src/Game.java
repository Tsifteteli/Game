import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        // Get player name from player
        System.out.println("Welcome to the Game!");

        System.out.print("Please enter your name:");
        Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();
        Player player1 = new Player(name);

        System.out.println(" ");
        System.out.println("The brave explorer "+player1.getName()+" have gotten and tript into a hole. :-) ");
        System.out.println(" ");
        System.out.println(" ");

        GameMaster gamemaster = new GameMaster(player1);
        gamemaster.runGame();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Thank you for playing the Game! "+player1.getName());

    }
}