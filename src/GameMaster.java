import java.util.Scanner;

/* Array for the rooms
    0   1   2   3   4
  +-------------------+
0 | S |   |   |   |   |
  |---+---+---+---+---|
1 | x | x |   |   |   |
  |---+---+---+---+---|
2 | x | E |   |   |   |
  |---+---+---+---+---|
3 |   |   |   |   |   |
  |---+---+---+---+---|
4 |   |   |   |   |   |
  +---+---+---+---+---+
*/

public class GameMaster {

    private Player player1;
    private Room[][] room = new Room[5][5];

        public GameMaster(Player player) {

            //player1  = new Player(name);
            player1 = player;

            //Setting up rooms
            // Room("Room Name","Room Narritive",Door North,Door South,Door West,Door East,Boolean isExit);

            Door lockedDoor1 = new Door("Door",true);

            room[0][0] = new Room("Cave entry","In the bottom of the hole there is a gloomy entry to the dark caves",null,new Door("GateEentry"),null,null,false);
            room[1][0] = new Room("Studdy","A big room with desk and cocking fire.",new Door("GateEentry"),new Door("Smal opening"),null,lockedDoor1,false);
            room[1][1] = new Room("Smal side room","Not mutch but a low tunnel.",null,new Door("Low tunnel"),lockedDoor1,null,false);
            room[2][0] = new Room("Bedroom","Smal sideroom with a bed.",new Door("Smal opening"),null,null,null,false);
            room[2][1] = new Room("The End","Cave opening to the frech air.",null,null,null,null,true);


    }

    public void runGame(){


        Boolean rungameloop = true;
        Room currentRoom;

        //Start room
        int i=0;
        int j=0;

        do{
            currentRoom=room[i][j];
            currentRoom.enterRoom();
            if(currentRoom.isExit()){break;}

            currentRoom.getChose(player1);
            if(!currentRoom.goToNextRoom(player1)){
                String chose = player1.getChose();
                switch (chose){
                    case "n": i--; break;
                    case "s": i++; break;
                    case "w": j--; break;
                    case "e": j++; break;
                    case "q":
                        System.out.println("Quit game.");
                        rungameloop=false;
                        break;
                }
            }
        }while(rungameloop);



    }
		
}