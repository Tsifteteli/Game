public class Door {


	private boolean locked = false;
	public String name;
	
    public Door(String name, boolean locked) {
		this.locked=locked;
		this.name = name;
	}

    public Door(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean getLocked(){
		return locked;
	}
	
	public void unLock(){
		locked=false;
	}
	
}