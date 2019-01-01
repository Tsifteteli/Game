public class Room {

	private String name;
	private Door doorN=null;
	private Door doorS=null;
	private Door doorW=null;
	private Door doorE=null;
	
    public Room(String name,Door doorN,Door doorS,Door doorW, Door doorE) {
		this.name = name;

		this.doorN = doorN;
		this.doorS = doorS;
		this.doorW = doorW;
		this.doorE = doorE;
	}
	
	public String getname(){
		return this.name;
	}
	
}