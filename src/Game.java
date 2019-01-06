import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        // Get player name from player
        System.out.println("Welcome to the Game!");
	System.out.print("\n"
+"                        ,/     _,---._\n"
+"             ,       _,'/|  ,-'       `.\n"
+"              \\.__,-' // `./   ____     \n"
+"               \\\\    //   `. ,'\\__/`.    \\ \n"
+"                \\\\  //  /   `.,'  `./`.   `. \n"
+"                 ||//   /     `-.   `.'|    \\ \n"
+"                 / ,`,-----------:=- |-|     \\ \n"
+"      __        ,' )\\,_        ,-'    | |      `.__ \n"
+"    /))/)       \\,/)/ \\\\\\    /'      /`-|          `---.___ \n"
+"   ())'_)       / '   /,\\\\ ,/       |`-,' \n"
+"   /)).\\____,-_/  , ,'~  \\\\|        |--|          , \n"
+"  (()||_)~~~~|' ,','      )'        `._,\\  `.     `. \n"
+"   ((\\\\/      \\/_/       (          / `.-\\   \\      ) \n"
+"     /\\\\                  `,       /    \\-`-.,'   ,/ \n"
+"    / ')\\                        ,'     /`-./   ,'---.____ \n"
+"   |     |                      /   ,--'   /   /---.______ \n"
+"   |  |  |            ,-.-. _,-'  ,-,-._  /  _/ \n"
+"   |_/|_,'           /\\/ ) `  /|,/\\/\\_, `-  /\\ \n"
+"    // ||_          //'|/\\__,'\\|(/'|/ \\___,'`,) \n"
+"    `-  ~~          `  `           `\n");
        
        System.out.print("\n Please enter your name:");
        Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();
        // Create a new player
        Player player1 = new Player(name);

        System.out.println(" ");
        System.out.println("The brave explorer "+player1.getName()+" have gotten and tript into a hole. :-) ");
        System.out.println(" ");
        System.out.println(" ");

        //Create a new game and send the player reference into it.
        GameMaster gamemaster = new GameMaster(player1);
        gamemaster.runGame();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Thank you for playing the Game! "+player1.getName());

    }
}