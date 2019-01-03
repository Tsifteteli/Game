import java.util.Scanner;
import java.util.ArrayList;

public class Room {

	private String name;
	private String narritive;
	private Door doorN=null;
	private Door doorS=null;
	private Door doorW=null;
	private Door doorE=null;
	private ArrayList<String> choseList = new ArrayList<String>();
	private Boolean isExit = false;
	
    public Room(String name,String narritive,Door doorN,Door doorS,Door doorW, Door doorE,Boolean isExit) {
		this.name = name;
		this.narritive = narritive;
		this.doorN = doorN;
		this.doorS = doorS;
		this.doorW = doorW;
		this.doorE = doorE;
		this.isExit = isExit;
	}
	
	public Boolean isExit(){
		return isExit;
	}
	
	public Boolean goToNextRoom(Player player1){
		//Is monster beaten
		//is the way to next room locked
		String chose = player1.getChose();
		Door selectedDoor = null;
		
		switch (chose){
			case "n": selectedDoor = doorN; break;
			case "s": selectedDoor = doorS; break;
			case "w": selectedDoor = doorW; break;
			case "e": selectedDoor = doorE; break;
		}
		
		if(selectedDoor.getLocked()){
			System.out.println("# The way is locked! #");
			
			//If palyer has key unlock the door and it will stay unlocked
			if(player1.hasKey()){
				System.out.print("Do you like to unlock the door with your key enter (y):");
				Scanner scan= new Scanner(System.in);
				String valin = scan.nextLine();
				valin = valin.toLowerCase();
				if(valin.equals("y")){ 
					selectedDoor.unLock(); 
					System.out.println("The way is unlocked.");
				}
			}
		}
		
		return selectedDoor.getLocked();
	}
	
	public void enterRoom(){
		
		System.out.println(" ");
		System.out.println("#--You are in ----------------");
		System.out.println("# "+name);
		System.out.println("#-----------------------------");
		System.out.println("# "+narritive);
		System.out.println("#-----------------------------");
		
		if(doorN!=null){System.out.println("# "+doorN.getName()+" to the North"); choseList.add("n");}
		if(doorS!=null){System.out.println("# "+doorS.getName()+" to the South"); choseList.add("s");}
		if(doorW!=null){System.out.println("# "+doorW.getName()+" to the West"); choseList.add("w");}
		if(doorE!=null){System.out.println("# "+doorE.getName()+" to the East"); choseList.add("e");}
		System.out.println("#-----------------------------");

	}
	
	public void getChose(Player player1){
		
		String chose = "";
		
		if(doorN!=null){System.out.println("Enter n to go North"); }
		if(doorS!=null){System.out.println("Enter s to go South"); }
		if(doorW!=null){System.out.println("Enter w to go West"); }
		if(doorE!=null){System.out.println("Enter e to go East"); }
		
		do {
			System.out.print("Select an alternetiv to do:");
			Scanner scan= new Scanner(System.in);
			chose = scan.nextLine();
			chose = chose.toLowerCase();
			
		}while(!choseList.contains(chose));
		
		player1.setChose(chose);
	}
	
}