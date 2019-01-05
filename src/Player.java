public class Player {

    private String name;
    private int damage = 1;
    private int helth = 10;
    private String chose;
	
    public Player(String name) {
	this.name = name;
    }
	
    public Boolean hasKey(){
        return true;
    }

    public void setChose(String chose){
        this.chose = chose;
    }

    public String getChose(){
        return chose;
    }

    public String getName(){
        return this.name;
    }
	
}