public class GameMaster {


    public GameMaster(String Playername) {

		System.out.println("Hej !");
      System.out.println(Playername+" Please wait while the game is getting ready for you...");
		
		Player player = new Player(Playername);
		
		
		Room[][] room = new Room[3][2];
		
		
		room[0][0] = new Room("Ett",null,new Door(true,"Gate1"),null,null);
		room[1][0] = new Room("Två",new Door(true,"GateN"),new Door(true,"GateS"),new Door(true,"GateW"),new Door(true,"GateE"));
		room[2][0] = new Room("Tre",null,null,new Door(true,"GateW"),null);
		
		
	}
	
	public void runGame(){
		
		while(true){
			
			
		}
		
		
	}
	
	
}