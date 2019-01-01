import java.util.Scanner;

public class Game {


    public static void main(String[] args) {
		// Get player name from player
		System.out.println("Welcome to the Game!");
		System.out.print("Please enter your name:");
		
		Scanner scan= new Scanner(System.in);
		String name= scan.nextLine();
		
		GameMaster game = new GameMaster(name);
		
		game.runGame();
		
	}
	
}