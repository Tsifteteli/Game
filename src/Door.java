public class Door {

	private boolean locked;
	public String name;
	
    public Door(boolean invalue,String name) {
		this.locked=invalue;
		this.name = name;
	}
	
	public boolean getlocked(){
		return this.locked;
	}
	
}